package C07ExceptionFileParsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class C03File {
    public static void main(String[] args) throws IOException {
////        콘솔창에 키보드를 통한 입출력
////        BufferedReader: 전달하고자 하는 데이터를 모음
////        InputStreamReader : 문자열체계를 통한 입력
////        System.in : 키보드를 통한 입력
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        System.out.println(input);

////        파일에서 읽기 : I/O패키지
//        BufferedReader br2 = new BufferedReader(new FileReader("src/C07ExceptionFileParsing/test.txt"));
//        String line = br2.readLine();
//        while(line!=null){
//            System.out.println(line);
//            line = br2.readLine();
//        }

////        파일에서 읽기 : NIO 패키지(non-Blocking) : IO 패키지보다 빠르다(Thread Blocking)
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/test.txt");
////        readString : 문자열 전체를 통째로 read
//        String st1 = Files.readString(filePath);
//        System.out.println(st1);
////        readAllLines : 문자열을 라인별로 split하여 list 형태로 저장
//        List<String> st2 = Files.readAllLines(filePath);
//        System.out.println(st2);

////        파일에 문자열 쓰기
//        Path filePath = Paths.get("src/C07ExceptionFileParsing/test.txt");
//        Files.write(filePath, "홍길동0".getBytes(), StandardOpenOption.CREATE_NEW); // 새로만들기
//        Files.write(filePath, "홍길동1\n".getBytes(), StandardOpenOption.WRITE); // 덮어쓰기
//        Files.write(filePath, "홍길동2\n".getBytes(), StandardOpenOption.APPEND); // 덮어쓰기


    }
}
