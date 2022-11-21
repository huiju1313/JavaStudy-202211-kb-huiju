package j08_클래스;

public class PhoneMain {
    public static void main(String[] args) {

        Phone iPhone14 = new Phone(); // Phone = 자료형 / iPhone14 = 변수명 //생성자호출? 생성자가 두번 호출되었다
        Phone galaxyS22 = new Phone("SAMSUNG", "GalaxyS22"); // new가 들어간다면 메모리 할당이라고 생각하면 된다 매번 새로운 메모리가 할당된다
        System.out.println(iPhone14); // 주소출력
        System.out.println(galaxyS22);


        iPhone14.company = "Apple";

        galaxyS22.company = "SAMSUNG";

        iPhone14.printPhoneCompany();
        iPhone14.printPhoneModel();

        galaxyS22.printPhoneCompany(); // printPhoneCompany 메소드를 호출한 것
        galaxyS22.printPhoneModel(); // printPhoneModel
    }
}

/*

Class : Student, StudentMain
학생정보
String school (학교명)
String name (학교이름)
int studentTear(학년)
boolean gender(성별 true=남, false=여)

showStudentInfo() {
    학교명 : 부산대학교
    이름 : 홍길동
    학년 : 3
    상뱔 : 님
    }

 */