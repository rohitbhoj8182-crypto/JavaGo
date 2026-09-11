import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Student stu = new Student("Roman",21,8.2,false);
        Student stu2 = new Student("Vikas",18,10,true);
        User us1 = new User("rohit");
        sc.close();
    }
}