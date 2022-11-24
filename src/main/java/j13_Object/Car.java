package j13_Object;

public class Car {
    private String model;
    private String color;

    public Car(String model, String color) { // 여기서만 선언하였을 시 업캐스팅 하였을 때 사용 불가능
        this.model = model;
        this.color = color;

    }

    @Override // override가 되었기에 자식메서드도 사용이 가능한 것
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
