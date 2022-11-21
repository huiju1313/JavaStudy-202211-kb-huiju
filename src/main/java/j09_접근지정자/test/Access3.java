package j09_접근지정자.test;

public class Access3 {
    private String address;

    void printAddress() {
        System.out.println("Address : " + this.address); // address 변수가 하나밖에 없어서 this생략가능
    }
}
