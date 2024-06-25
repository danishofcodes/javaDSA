package IO;
import java.util.*;
public class Greetings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you name");
        String name = sc.nextLine();
        sc.close();
        System.out.println("Hi there, him"+name+" nice to see you again");
    }
}
