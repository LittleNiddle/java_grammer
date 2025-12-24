package C07ExceptionFileParsing;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;

public class C05HttpJsonParsing {
    public static void main(String[] args) throws IOException, InterruptedException {
////        외부에서 데이터를 받아 java의 객체로 변환
////        외부 api 요청을 하기 위한 라이브러리 : HttpClient, RestTemplate, RestClient
////          HttpClient : java 내장 클래스.
////          RestTemplate, RestClient : 스프링에서 가장 많이 사용하는 클래스.
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts/1")).GET().build();
//        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
//        String data = response.body();
//
////        객체로 파싱
//        ObjectMapper o1 = new ObjectMapper();
//        Post p1 = o1.readValue(data, Post.class);
//        System.out.println(p1);

////        리스트 형식의 객체로 파싱
//        HttpClient client = HttpClient.newHttpClient();
//        HttpRequest request2 = HttpRequest.newBuilder().uri(URI.create("https://jsonplaceholder.typicode.com/posts")).GET().build();
//        HttpResponse<String> response2 = client.send(request2, HttpResponse.BodyHandlers.ofString());
//        String data2 = response2.body();
//        ObjectMapper o1 = new ObjectMapper();
//        JsonNode jsonNodes = o1.readTree(data2);
//        List<Post> postList = new ArrayList<>();
//        for(JsonNode j : jsonNodes){
//            postList.add(o1.readValue(j.toString(), Post.class));
//        }
//        System.out.println(postList);

////        직렬화
//        String result = o1.writeValueAsString(p1);
//        System.out.println(result);

    }
}

class Post{
    private Long userId;
    private Long id;
    private String title;
    private String body;

    public Long getUserId() {
        return userId;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getBody() {
        return body;
    }

    @Override
    public String toString() {
        return "{" +
                "userID=" + userId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                '}';
    }
}
