public class Student {

    String name ;
    int age;
    double gpa;
    boolean isPresent;

    //Constructor
    Student(String name , int age , double gpa , boolean isPresent){
        this.name = name;
        this.gpa =gpa;
        this.age=age;
        this.isPresent = isPresent;

        System.out.println("user "+this.name +" has age : "+this.age+ " has current  Gpa :" + this.gpa + " is logged in "+this.isPresent);
    }
}
