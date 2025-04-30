package DesignPattern.singleton;

public class Main {
    public static void main(String[] args) {
        Samosa s = Samosa.getSamosa();
        System.out.println(s.hashCode());
        Samosa s1 = Samosa.getSamosa();
        System.out.println(s1.hashCode());

        //here hashcode of both the samosa are same means only one object is created
    }
}
