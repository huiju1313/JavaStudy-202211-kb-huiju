package j11_상속.동물;

public class Human extends Animal {

    public Human() {
        super();
        System.out.println("Human 객체 생성");
    }

    @Override //@ 붙은 문법 -> 어노테이션
    public void move() { // 오버라이드
        System.out.println("사람이 두 발로 걷습니다."); // 다운캐스팅 하면 사용 불가
    }

    public void readBooks() {
        System.out.println("사람이 책을 읽습니다."); // 업캐스팅하면 사용 불가
    }

}
