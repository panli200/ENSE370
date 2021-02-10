/*
 * Wheel Game Bonus Round: two players game.
 * One player enter the clue and the answer. Display the letters of answer string only if contains "R" "S" "T" "L" "N" "E".
 * Second player can enter three consonants and a vowel, the string will display the letter matched.
 * Then, second player has to guess the left empty spot letters. Only give the same amount of chances with empty spots.
 * If the second player guess are all correct, the player win. vice verse. 
 */
import java.util.Scanner;
import java.lang.StringBuilder;
/**
 *
 * @author LiPan 200371281
 */
public class WheelGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Initial scanner for getting input*/     
        Scanner input = new Scanner(System.in);
        System.out.println("PLAYER 1");
        System.out.print("Clue: ");
        String clue = input.nextLine();//Get input clue 
        System.out.print("Answer: ");
        String answer  = input.nextLine();//Get input answer
        String answerUpcase = answer.toUpperCase();//Covert the string to the upper case    
        char[] chars = answerUpcase.toCharArray();//Convert the string to the character array
        
        //clear the terminal screen
        for(int i = 0; i < 20; i++)
            System.out.println();
        
        
        System.out.println("PLAYER 2");
        /*Display the clue and asnwer from initialize*/
        System.out.println("Clue: " + clue);
        System.out.print("Answer: ");
        //Display the answer string with"RSTLNE" by upper case and seperate each letter
        for(int i = 0; i < answerUpcase.length(); i++){
            if (chars[i] == 'R' || chars[i]=='S'|| chars[i]=='T'|| chars[i]=='L'|| chars[i]=='N'|| chars[i]=='E'){
                 System.out.print(chars[i] + " ");
            }
            else
                
                System.out.print("_" + " ");
        }
        
        System.out.println();

        //int guessNum = 0;//Initial the amount of missing letters
        //int guessRight=0;//Intial the amount of guess right letters
        System.out.print("Choose three consonants and a vowel: ");
       
        //Get three consonats and a vowel from player2
        String guess = input.nextLine();
          
        
        while (guess.length()!= 4){
            System.out.print("Please Re-enter three consonats and a vowel: ");
            guess = input.nextLine();           
        }
        guess = guess.toUpperCase();//Covert the string to the upper case 
        char char0=guess.charAt(0);
        char char1=guess.charAt(1);
        char char2=guess.charAt(2);
        char char3=guess.charAt(3);
        
        /*Testing & Checking the input letters match the three consonats and a vowel; the length of the input should four letters*/
        while(  char0 =='A' || char0 =='E' || char0 =='I'|| char0 =='O' || char0 =='U' ||
                char1 =='A' || char1 =='E' || char1 =='I'|| char1 =='O' || char1 =='U' || 
                char2 =='A' || char2 =='E' || char2 =='I'|| char2 =='O' || char2 =='U' ||                
                (char3 !='A' && char3 !='E'&& char3 !='I'&& char3 !='O' && char3 !='U')    ) 
        {
            System.out.print("Please Re-enter three consonats and a vowel: ");
            guess =input.nextLine();
            
            char0=guess.charAt(0);
            char1=guess.charAt(1);
            char2=guess.charAt(2);
            char3=guess.charAt(3);
        }
              
        //clear the terminal screen
        for(int i = 0; i < 20; i++)
            System.out.println();
        
        /*Display the String after player entering three consonats and a vowel */       
        System.out.println("Clue: " + clue);        
        System.out.print("Answer: ");
        for(int i = 0; i < answerUpcase.length(); i++){
            
            if (chars[i] == 'R' || chars[i]=='S'|| chars[i]=='T'|| chars[i]=='L'|| chars[i]=='N'|| chars[i]=='E'){
                System.out.print(chars[i] + " ");
            }
            else if(chars[i] == char0 || chars[i] == char1 || chars[i] == char2 || chars[i] == char3)
                System.out.print(chars[i] + " ");
                
            else{
                System.out.print("_" + " ");
               // guessNum++;
            }
        }
        
        System.out.println();
        
        /*Given limited guess time. Checking the player2 each guess letter is matching all missing letter or not  */  
        for(int i =0; i < 3; i++){       
            System.out.print("Enter your guess: ");      
            String guessAnswer = input.nextLine();
            guessAnswer = guessAnswer.toUpperCase();
            
            if(answerUpcase.equals(guessAnswer)){
                System.out.println("Guess is correct! ");
                System.exit(0);
                
            }  
            else 
               System.out.println("Guess is wrong! ");          
        }
        
        System.out.println("Game Over");
    }         
}      
    
        
        

