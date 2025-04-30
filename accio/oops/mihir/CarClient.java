package accio.oops.mihir;

public class CarClient {
    public static void main(String[] args) {
        Car car = new Car();
        Car car1 = new Car("BMW","Blue",5);
        System.out.println(car.name+ " "+car.color);
        System.out.println(car1.name+ " "+car1.color+" "+car1.price);
    }
}
