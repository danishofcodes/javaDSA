package calc_prog;

import java.util.*;
public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check whter odd or even");
        int num = sc.nextInt();
        sc.close();
        
        if(num%2==0){
            System.out.println(num+" -is even");
        }else{
            System.out.println(num+" -is odd");
        }
        
        
    }
}
