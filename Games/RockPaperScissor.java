import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        String sign[] = { "rock", "paper", "scissors" };
         int computerScoreCounter = 0;
         int humanScoreCounter = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Use [1] for stone, [2] for paper, [3] for scissors and [0] for exit");

        while (true) {
            
            System.out.println("Throw :");
            int s = sc.nextInt();
            
            if (s == 0) {
                System.out.println("Final Score : ");
                System.out.println("[ You : " + humanScoreCounter +" ] [ Computer : " + computerScoreCounter +" ]");
                break;
            }else if(s>=1 && s<=3){
                System.out.println("You : " + sign[s-1]);
            }else{
                System.out.println("Invalid option");
                break;
               
            }
            
          String signComp = random(sign);
            System.out.println("computer : " + signComp);


            if(signComp==sign[s-1]){
                System.out.println("game draw \n");
            }
            
            else if(signComp=="scissors" &&  sign[s-1] == "paper"){
                System.out.println("Computer Won \n");
                computerScoreCounter++;

            }
            
            else if(signComp=="rock" &&  sign[s-1] == "scissors"){
                System.out.println("Computer Won \n");
                computerScoreCounter++;

            }
            
            else if(signComp=="paper" &&  sign[s-1] == "rock"){
                System.out.println("Computer  Won");
            }
            
            else if(signComp=="rock" &&  sign[s-1] =="paper"){
                System.out.println("You Won \n");
                humanScoreCounter++;
            }
            
            else if(signComp=="scissors" &&  sign[s-1] == "rock"){
                System.out.println("You Won \n");
                humanScoreCounter++;
            }
            
            else if(signComp=="paper" &&  sign[s-1] == "scissors"){
                System.out.println("You Won \n");
                humanScoreCounter++;
            }
            
            

        }
        sc.close();

    }

    public static String random(String[] signs) {

        double randomNum = Math.random()*3;
        int randomIndex = (int) Math.floor(randomNum);

        String sign = signs[randomIndex];
        return sign;
    }
}
