import java.util.Scanner;

public class CharacterOccurance {
    public static void main(String[] args) {

        String str = "";
        char ch;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a String");
        str = sc.nextLine();
        System.out.println("Enter character to extract");
        ch = sc.next().charAt(0);
        sc.close();
        extractChar(ch, str.toLowerCase());
    }

    public static void extractChar(char ch, String str) {
        int charIndex =0;
        int occurance= 0;
        String occuranceIndex = "";

        for(int i=0; i < str.length(); i++){
            if(str.charAt(i)==ch){
                charIndex = i; 
                occurance++;
                occuranceIndex = occuranceIndex+charIndex+". ";
            }
        }
        System.out.println("The character "+ ch + " is at Index: "+occuranceIndex);
        System.out.println("and has occured " + occurance +" -times");
}
}