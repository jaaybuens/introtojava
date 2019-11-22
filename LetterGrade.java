//Jazmin Bueno
//CS 21 - 73828
//Letter Grade Project
import java.util.*;
public class LetterGrade{
    public static double calcAverage( Scanner scanner ) {
        double avg = 0.0;
        System.out.println("Please enter 3 scores.");
        double scores;
        for( int a = 1; a<= 3; a++ ) {
            scores = scanner.nextInt();
            
            avg = scores + avg;
            
        
        } 
        avg = avg/ 3;
        
        return avg;
    }
    
     public static void printLetter( double testScore ) {
       String letterGrade = "";
        if( testScore < 60) {
             letterGrade = "F";
           } else if ( testScore < 70 ){
        letterGrade = "D";
             } else if ( testScore < 80 ) {
             letterGrade = "C";
            } else if ( testScore < 90 ) {
            letterGrade = "B";
            } else if ( testScore < 101 ){
            letterGrade = "A";
           }
        System.out.print(letterGrade);
        }
   
 public static void main( String [ ] args ) {
        Scanner scanner = new Scanner( System.in );
        
        System.out.println("Please enter your name.");
        String name;
        name = scanner.nextLine();
        
        double avg = calcAverage(scanner);
        
        
        System.out.printf("%s %.2f\n", name ,avg);
        printLetter(avg);
        
        
        
        }
}
