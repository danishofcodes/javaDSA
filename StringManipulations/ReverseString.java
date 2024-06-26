import java.util.Scanner;

public class ReverseString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string to reverse : \n");
        String str =  sc.nextLine();
        sc.close();
            
        String reversed = revstring(str);

        System.out.println("Reversed String : \n");
        System.out.println(reversed);  
    }

    public static String revstring(String str){
            String rev = "";
            for(int i=0; i < str.length(); i++){
             rev = str.charAt(i) + rev;
            }
            System.out.println("your rev string");
            return rev;
    }
}