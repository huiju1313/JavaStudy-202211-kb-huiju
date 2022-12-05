//package j16_컬렉션.List;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class StudentList {
//    public static void main(String[] args) {
//
//        List<Student> students = new ArrayList<Student>();
//
//        students.add(new Student(20220001, "이승아", 21, null));
//        students.add(new Student(20220002, "김수현", 22, null));
//        students.add(new Student(20220003, "문경원", 23, null));
//        students.add(new Student(20220004, "홍지혜", 24, null));
//        students.add(new Student(20220005, "고동현", 25, null));
//
//        Student student2 = students.get(3);
//
//        System.out.println(student2);
//
//        //이름이 문경원인 학생의 나이를 26세로 바꾸세요.
//
//        for(int i = 0; i < students.size(); i++) {
//            Student s = students.get(i);
//            if(s.getName().equals("문경원")) {
//                s.setAge(26);
//                break;
//            }
//        }
//
//        for(Student s : students) {
//            if(s.getName().equals("문경원")) {
//                s.setAge(26);
//                break;
//            }
//        }
//
//        System.out.println(students);
//
//        // 0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
//        // 제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동
//
//        String lastName = null;
//        for(int i = 0; i < students.size(); i++) {
//            int nowIndex = students.size() - 1 - i;
//            int preIndex = nowIndex - 1;
//            Student s = students.get(nowIndex);
//
//            if(nowIndex == 0) {
//                s.setName(lastName);
//            }
//
//            if(nowIndex == students.size() - 1) {
//                lastName = s.getName();
//            }
//            s.setName(students.get(preIndex).getName());
//        }
//
//        System.out.println(students);
//
//    }
//}
//

package j16_컬렉션.List;

import j11_상속.A;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

        students.add(new Student(20220001, "이승아", 21, null));
        students.add(new Student(20220002, "김수현", 22, null));
        students.add(new Student(20220003, "문경원", 23, null));
        students.add(new Student(20220004, "홍지혜", 24, null));
        students.add(new Student(20220005, "고동현", 25, null));

//        Student student = new Student(20220001, "고희주", 25);
//        students.add(student); // 위처럼 한 줄로 정의 가능

        Student student2 = students.get(3);

        System.out.println(student2);

        //이름이 문경원인 학생의 나이를 26세로 바꾸세요


        for (int i = 0; i < students.size(); i++) {
            Student s = students.get(i);
            if (s.getName().equals("문경원")) {
                s.setAge(26);
                break;
            }


            for (Student s2 : students) {
                if (s.getName().equals("문경원")) {
                    s.setAge(26);
                    break;
                }
            }
        }

        System.out.println(students);

//        String str = students.get(0).getName();
//
//        for (int i = 0; i < students.size(); i++) {
//            Student s = students.get(i);
//            if(i < students.size() - 1) {
//                String s2 = students.get(i-1).getName();
//                s.setName(s2);
//            }else{
//                s.setName(str);
//;            }
//
//        }

        String lastName = null;
        for(int i = 0; i < students.size(); i++) {
            int nowIndex = students.size() -1 -i;
            int preIndex = nowIndex -1;
            Student s = students.get(nowIndex);

            if(nowIndex == 0) {
                s.setName(lastName);
                break; // 안걸면 밑에 있는 것이 실행되어 버린다. 밑에 if문 말고
               // s.setName(students.get(preIndex).getName()); 이게 실행되어버린다.
            }

            if(nowIndex == students.size() -1) {
                lastName = s.getName();
            }
            s.setName(students.get(preIndex).getName());
        }

        System.out.println(students);


        }
    }



        //0번 인덱스 학생의 이름을 다음 인댁스의 학생 이름으로 변경
        //제일 마지막 인덱스의 학생 이름은 0번 인덱스로 이동




