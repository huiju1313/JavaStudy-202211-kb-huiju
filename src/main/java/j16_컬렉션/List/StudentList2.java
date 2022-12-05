package j16_컬렉션.List;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;


public class StudentList2 {
    public static void main(String[] args) {
        List<Hobby> hl = Arrays.asList(new Hobby[] {
                new Hobby(1, "축구"),
                new Hobby(2, "농구"),
                new Hobby(3, "골프"),
                new Hobby(4, "음악감상")
        });

        Student s1 = Student.builder()
                .studentId(20220001)
                .name("고동현")
                .age(21)
                .hobbyList(Arrays.asList(new Hobby[] {hl.get(0), hl.get(2)}))
                .build();

        Student s2 = Student.builder()
                .studentId(20220002)
                .name("강동욱")
                .age(22)
                .hobbyList(Arrays.asList(new Hobby[] {hl.get(1), hl.get(3)}))
                .build();

        Student s3 = Student.builder()
                .studentId(20220002)
                .name("정진호")
                .age(23)
                .hobbyList(Arrays.asList(new Hobby[] {hl.get(0), hl.get(3)}))
                .build();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        List<Student> sl = new ArrayList<Student>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);

        for(Student s : sl) {
            System.out.println("<학생정보>");
            System.out.println(s);
            System.out.println("<" + s.getName() + "학생취미>");
            for(Hobby h : s.getHobbyList()) {
                System.out.println(h);
            }
            System.out.println();
        }


////        String[] names = new String[] {"김준일", "김준이", "김준삼"};
////
////        List<String> nameList;
////
////        nameList = Arrays.asList(names);
//        //아래와 같이 한 줄로 정의
//        List<String> nameList = Arrays.asList(new String[] { "김준일", "김준이", "김준삼"}); // 배열을 Array List로 변환하는 법
//
//        for(Hobby h : hobbyList) {
//            System.out.println(h);
//        }
//
//        //Object[] nameArray = nameList.toArray(); 다운캐스팅은 아래 처럼이 아닌
//        //String[] nameArray = (String[]) nameList.toArray();
//        Object[] nameArray = nameList.toArray();
//
//        System.out.println((String)nameArray[0]); //배열을 통으로 다운캐스팅 하는 것이 아니라 안에 들어있는 값을 해줘야 한다.
    }
}
