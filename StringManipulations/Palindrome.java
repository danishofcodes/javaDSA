import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to find whether Palindrome: \n");
        String str = sc.nextLine();
        sc.close();


        System.out.println("Result: \n");
        if(palindromeCheck(str)==true){
            System.out.println("Is Palindrome");
        }else{
            System.out.println("Is not a Palindrome");
        }

    }
    public static boolean palindromeCheck(String str){
        String rev = "";
        for(int i=0; i<str.length(); i++){
            rev =  str.charAt(i) + rev;
        }
        if(str.equals(rev)){
            return  true;
        }
        return false;
    }

}
