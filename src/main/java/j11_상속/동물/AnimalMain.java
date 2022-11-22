package j11_상속.동물;

import j11_상속.A;

public class AnimalMain {
    public static void main(String[] args) {
        Animal animal = new Animal(); // Animal 생성자 호출
        Human human = new Human();
        Tiger tiger = new Tiger();

        int a = (int) 3.14;
        double d = 3; // 업캐스팅은 생략 가능

//        animal.move();
//        human.move();
//        tiger.move();

        Animal hAnimal = (Animal) human; // 업캐스팅이므로 "(Animal)" 생략 가능
        Animal tAnimal = tiger;
        Animal[] animals = new Animal[5];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();
        animals[4] = new Human();

        System.out.println();

        System.out.println("[업캐스팅]");
        ////업캐스팅이 되면서 오버라이드 된 것 말고 human 클래스에만 정의되어 있는 것은 비활성ㅘ 된다. (readBooks 를 사용하지 못 한다.)
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
        System.out.println();

        System.out.println("[다운캐스팅]");
        for (int i = 0; i < animals.length; i++) {
            if(animals[i] instanceof Human) { // Tiger가 Human으로 다운캐스팅 되는 것을 방지함
                Human h = (Human) animals[i]; // 다운캐스팅을 통하여 h는 readBooks를 호출할 수 있게 됨
                h.readBooks();
            }else if (animals[i] instanceof Tiger) {
                Tiger t = (Tiger) animals[i];
                t.hunting();
            }else {
                System.out.println("다운캐스팅 불가");
            }
        }

//
// 부모는 자식으로 다운캐스팅 불가능 , 자식끼리 다운캐스팅 불가능

    }
}
