package calc_prog;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nth term for factorial :");
        int nth = sc.nextInt();
       sc.close();
       
    
        int result = findfactorial(nth);
        System.out.println(result);   
    };

    public static int findfactorial(int term){
        System.out.println("term out:"+term);

        if(term == 0){
            return 1;
        }else{
            System.out.println("term plus:"+term);
            return  term * findfactorial(term-1);
        }
        
    };
}
