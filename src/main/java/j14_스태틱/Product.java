package j14_스태틱;

/*
    공유영역
 */

import lombok.Data;

@Data

public class Product {
    private  static int autoIncrement = 20220000;

    private int serialNumber;
    public String name;

    public Product(String name) { // 생성자 product가 생성되면 serialNumber가 1이 증가된다.
        this.serialNumber = ++autoIncrement; // 숫자를 정해두고 새로 생성될 떄 마다 1씩 증가한다
        this.name = name; // 생성할 떄 받아온다

    }

    public static void print() {
        System.out.println(autoIncrement);
        Product product = new Product("아이폰");
        product.add(10,20);
    //    System.out.println(serialNumber); 메모리에 할당되지 않아서 출력 불가능
    }

    public int add(int a, int b) {
        return a + b;
    }

}

//static은 공유된다.
// static이 붙으면 new 를 사용하지 않고 . 으로 사용 가능
// 안 붙으면 new를 사용해야한다.