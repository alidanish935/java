package accio.oops;

public class inheritence {
    public static void main(String[] args) {
        //
        Student s1= new Student(1, "danish", 2, 'A');
        s1.print();
        s1.printStudent();
    }

}
class User{
    int uid;
    String name;
    User(int id, String nm){
        uid = id;
        name = nm;
    }
    void print(){
        System.out.println(uid);
        System.out.println(name);
    }
}
class Student extends User{
    int semester;
    char grade;
    Student (int id,String name ,int s , char g){
        super(id, name);
        semester =s;
        grade =g;
    }
    void printStudent(){
        System.out.println(semester);
        System.out.println(grade);
    }
}
