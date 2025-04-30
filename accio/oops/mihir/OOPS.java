package accio.oops.mihir;

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        //s1.name = "Danish Ali"; // it is giving error bcz name is private in student class 
        s1.setName("Danish Ali");//so we can access through setter only
        s1.age = 22;
        s1.roll = 1;

        Student s2 = new Student();
     //   s2.name = " Ali";
        s2.setName("Ali");
        s2.age = 20;
        s2.roll = 1;

        // s1.printDetail();
        // s2.printDetail();
        System.out.println(s1.getName());
        System.out.println(s1.getAge());
        s1.setAge(9);// it is not giving error bcz age is not private in student class 
        System.out.println(s1.getAge());
        System.out.println(s2.getAge());
    }
}
