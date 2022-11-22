package j12_추상.추상클래스;

public class Human extends Animal {

    public Human(String kind) {
        super(kind); // 부모의 String 생성자를 불러오는 것
    }

    @Override
    public void move() {
        System.out.println("사람이 움직인다.");
    }
}
