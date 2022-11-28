package j14_스태틱.싱글톤;

import lombok.Getter;

import java.util.Scanner;

public class Scannersingleton {
//2. 자기 자신을 static 변수로 가지고 있어야 한다.
    private static Scannersingleton instance = null;

    @Getter
    private Scanner scanner; // scanner에 대한 @Getter가 생긴 것
//1. 생성자가 private 접근지정자 이어야 한다.
    private Scannersingleton() {
        scanner = new Scanner(System.in);
    }

    public static Scannersingleton getInstance() {
        if (instance == null) { // 결과적으로 한 번만 만드는 것
            instance = new Scannersingleton();

        }
        return instance; // Scannersingleton 객체를 리턴함
    }
}

//instance 변수는 Scannersingleton의 주소값
//getter는 private안에 있는 멤버변수, 메서드를 사용할 수 있다.