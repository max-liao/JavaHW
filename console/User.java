// package console;
import java.time.LocalTime;

public class User {
  String name;
  String email;
  int age;

  public User(String name, String email, int age){
    this.name = name;
    this.email = email;
    this.age = age;
  }
  
  double targetAdherence() {
    return 1;
  }

  public static void main(String[] args) {
    User myUser = new User( "Max", "max@gmail.com", 28); 
    System.out.println("User name: " + myUser.name); 
    System.out.println("User email: " + myUser.email); 
    System.out.println("User age: " + myUser.age);
  }
}