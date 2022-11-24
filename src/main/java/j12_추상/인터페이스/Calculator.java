package j12_추상.인터페이스;

import j11_상속.C;

public interface Calculator {
    //public만 사용 가능

    public int ERROR_CODE = -9999999; // 기본적으로 모든 변수선언은 상수로 선언된다. -> final 생략가능

   // public Calculator() {} 인터페이스는 생성자 사용 불가능

    public int calc(int[] values);

    public default void setErrorCode() {


    }
}