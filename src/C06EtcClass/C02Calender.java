package C06EtcClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;

public class C02Calender {
    public static void main(String[] args) {
////        java.util 패키지 안의 Calender 클래스 - 과거
//        Calendar myCalender = Calendar.getInstance();
//        System.out.println(myCalender.getTime());
//        System.out.println(myCalender.get(Calendar.YEAR)); // enum 타입 year 변수
//        System.out.println(myCalender.get(Calendar.MONTH)+1);
//        System.out.println(myCalender.get(Calendar.DAY_OF_WEEK)); // 요일
//        System.out.println(myCalender.get(Calendar.DAY_OF_MONTH));
//        System.out.println(myCalender.get(Calendar.HOUR));
//        System.out.println(myCalender.get(Calendar.MINUTE));
//        System.out.println(myCalender.get(Calendar.SECOND));

////        java.time 패키지의 LocalDateTime(*) 클래스, LocalDate, LocalTime - 현재 자주 사용
//        LocalDate myLocalDate = LocalDate.now();
//        System.out.println(myLocalDate);
//        System.out.println(myLocalDate.getYear());
//        System.out.println(myLocalDate.getMonth());
//        System.out.println(myLocalDate.getMonthValue());
//        System.out.println(myLocalDate.getDayOfMonth());
//        System.out.println(myLocalDate.getDayOfWeek());

//          System.out.println(myLocalTime.getSecond());

        LocalDateTime myLocalDateTime = LocalDateTime.now();
        System.out.println(myLocalDateTime.getYear());
        System.out.println(myLocalDateTime.getHour());
//        ChronoField매개변수로 다양한 형식의 날짜/시간정보 조회
        System.out.println(myLocalDateTime.get(ChronoField.YEAR));
        System.out.println(myLocalDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(myLocalDateTime.get(ChronoField.AMPM_OF_DAY)); // 0:오전, 1:오후
        System.out.println(myLocalDateTime.get(ChronoField.CLOCK_HOUR_OF_DAY)); // 24시 체계

//        .of: 임의로 특정 시간 정보 객체를 만들어내고 싶을 때 사용
        LocalDate birthday = LocalDate.of(2000, 11, 12);
        System.out.println(birthday);

        LocalDateTime birthdayTime = LocalDateTime.of(2000, 11, 12, 15, 12, 54);
        System.out.println(birthdayTime);
    }
}
