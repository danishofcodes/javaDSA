import java.util.Scanner;

public class CheckStringIsNumber {
    public static void main(String[] args) {

        String str = "";

        Scanner sc = new Scanner(System.in);       
        System.out.println("Enter a String to find whether its a number");
        str = sc.nextLine();

        sc.close();
           if(isNumber(str.toLowerCase().trim()) == true ){
            System.out.println(str+" is number");
           }else{
            System.out.println(str+" is not a number");
           }
    }

    public static boolean isNumber(String str) {
        boolean arr[] = new boolean [str.length()];
            for(int i = 0; i<str.length(); i++){
                if(str.charAt(i)>=48 && str.charAt(i)<=57){
                    System.out.println(str.charAt(i)+" is number");
                    boolean flag = true;
                    arr[i]=flag;
                }else{
                    System.out.println(str.charAt(i)+" is not number");
                    boolean flag = false;
                    arr[i]=flag;
                }
            }

            boolean isNum = false;
            for(int i =0; i<arr.length; i++){
                if(arr[i]){
                   isNum = true;
                }else{
                isNum =  false;
                }
            }
        
            return isNum;
        }
    }
    
    
