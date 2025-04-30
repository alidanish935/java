package accio.oops.mihir;

public class Student {
   private String name; // if we make any of these variable private means we cant access it outside class withot getter & setter
    int roll;
    int age;

    // data function
    public void sayName(){
        System.out.println("Danish");
    }
    public void printDetail(){
        System.out.println(this.name);
        System.out.println(this.roll);
        System.out.println(this.age);
    }
    // getters and setters
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
         this.age = age;
    }
    public void setName(String name){
         this.name = name;
    }
}
