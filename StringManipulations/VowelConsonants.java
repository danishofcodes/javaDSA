import java.util.Scanner;

public class VowelConsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String to find vowels and consonants present:");
        String str = sc.nextLine();
        sc.close();
        vowelConsonantFinder(str.trim().toLowerCase());
    }

    public static void vowelConsonantFinder(String str){
        int vowels = 0, consonants = 0;
        
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u'){     
                  vowels++;         
            }else if(str.charAt(i)==' '){
                   continue;
            }
            else{
                consonants ++;
            }
        }
        System.out.println("No Of Vowels are : "+vowels);
        System.out.println("No Of Consonants are : "+consonants);
    }
}
