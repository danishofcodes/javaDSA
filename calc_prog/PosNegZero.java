
package calc_prog;
import java.util.Scanner;

public class PosNegZero{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to see wther its +ve, -ve, or 0 : ");
        num = sc.nextInt();
        sc.close();

        if(num > 0 ){
            System.out.println("positive number");
        }else if(num < 0){
            System.out.println("negative number");
        }else{
            System.out.println("Zero");
        }
    }
}