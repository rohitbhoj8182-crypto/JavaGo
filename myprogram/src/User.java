public class User {
    String name;
    String email;
    int age;
    User(String name){
        this.name =name;

        this.email = "NA";
        this.age = 0;
        System.out.println("User created with name :"+name );
        System.out.println("User created with email :"+ this.email );
        System.out.println("User created with name :"+ this.age );

    }
}
