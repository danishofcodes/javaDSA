import java.util.Scanner;
public class FrequentCharacter {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String to find the character frequency");
    String str = sc.nextLine().toLowerCase().trim();
    sc.close();

    // calling frequency method , passed str an argument
    frequency(str);

}
public static void frequency(String str) {
    int[] arr = new int[256];
    int max = 0;
    char maxChar =' ';
    boolean multipleMax = false;  

    for (int i = 0; i < str.length(); i++) {
        
        char ch = str.charAt(i);
        arr[ch]++;

        if (arr[ch] > max) {
            max = arr[ch];
            maxChar = ch;
            multipleMax = false;  
        } else if (arr[ch] == max) {
            multipleMax = true;  
        }
    }

    if (!multipleMax) { 
        System.out.println("\n'"+maxChar+"' has the max frequency, it occurs [ "+max+" ]-times");
    } else {
        System.out.println("There are no characters with a distinct maximum frequency.");
    }
}
}