package accio.oops.mihir;

public class Car {
    String name;
    String color;
    int price;

    Car(){
        System.out.println("In default constructor");
        this.name = "Not specified";
        this.color = "Not specified";
        this.price = 0;
    }
    Car(String name,String color,int price){
        System.out.println("In parametrized constructor");
        this.name = name;
        this.color = color;
        this.price = price;
    }
}
