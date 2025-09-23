import java.util.Random;
import java.util.Scanner;

//class Guesser {
//     int GuessNumber(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Guesser, Please guess the number ! ");  // Guesser enters the number
//        int GuessNumber = scanner.nextInt();
//        return GuessNumber;
//
//    }
//}
class Guesser {
    int guessNumber() {
        Random rand = new Random();
        return rand.nextInt(100)+1; // Computer guesses a number between 1 and 100
    }
}
class Player{
    int playerNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Player, Please guess the number ! ");
        int playerNumber = scanner.nextInt();
        return playerNumber;
    }
}
class Empire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
   void collectNumberFromGuesser(){
       Guesser g = new Guesser();
       numFromGuesser = g.guessNumber();
    }
     void collectNumberFromPlayer(){
         Player p1 = new Player();
         Player p2 = new Player();
         Player p3 = new Player();
         numFromPlayer1 = p1.playerNumber();
         numFromPlayer2 = p2.playerNumber();
         numFromPlayer3 = p3.playerNumber();

     }
     void compareNumbers(){
         if(numFromGuesser == numFromPlayer1) {
         if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                 System.out.println("Player 1 , Player 2 and Player 3 , Won the match");
             } else if(numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer2 ){
                 System.out.println("Player 1 and Player 2, won the match");
             } else if (numFromGuesser == numFromPlayer1 && numFromGuesser == numFromPlayer3) {
                 System.out.println("Player 1 and Player 3 won the match");
             } else {
                 System.out.println("Player 1 won the match");
             }
         }else if(numFromGuesser == numFromPlayer2) {
             if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                 System.out.println("Player 2 and Player 3 won the match");
             } else {
                 System.out.println("Player 2 won the match");
             }
         }
             else if (numFromGuesser == numFromPlayer3){
             System.out.println("Player 3 won the match");
         }else{
             System.out.println("No one won the match");
         }
         System.out.println("The number guessed by the computer was: " + numFromGuesser);

     }
    }

public class GuessingNumberGame {
    public static void main(String[] args) {
        Empire empire = new Empire();
        empire.collectNumberFromGuesser();
        empire.collectNumberFromPlayer();
        empire.compareNumbers();

    }

}
