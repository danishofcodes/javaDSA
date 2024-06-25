package calc_prog;
import java.util.*;
public class Area{
    public static void main(String args[]){
        float l, w, area = 0; 
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length");
        l = sc.nextFloat();
        System.out.println("Enter width");
        w = sc.nextFloat();

        area = l*w;
        sc.close();

        System.out.println("Your Area Of Rectangle is : "+ area);
    }
}