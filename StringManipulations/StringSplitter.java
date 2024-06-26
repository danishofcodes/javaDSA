import java.util.Scanner;

public class StringSplitter {
    public static void main(String[] args) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence to Split into words");
        String str = sc.nextLine();
        sc.close();


        String []words = splitstring(str.replaceAll("\\s+", " ").trim());
        
        for(int i=0; i<words.length; i++){
            System.out.println(words[i]);
            count ++;
        }
        System.out.println("Total number of words : "+count);
    }

    public static String[] splitstring(String str) {
            return str.split(" ");
    }
}
