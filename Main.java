import java.util.Scanner;
/**
 * gets 10 integers and finds the one the user selects
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates scanner for user input
    Scanner input = new Scanner(System.in);

    //prompts user to enter 10 integers
    System.out.println("Please enter in 10 integers to put into the array");

    //creates array
    int array[] = new int[10];

    //puts users numbers into array
    for(int i = 0; i < array.length; i++){
      array[i] = input.nextInt();
    }

    //prompts user to enter number to find
    System.out.println("Please enter a number to find");
    int userNum = input.nextInt();

    //finds instances of that number in array and displays to user
    for(int i = 0; i < array.length; i++){
      if(array[i] == userNum){
        System.out.println(userNum + " is located at index " + i);
      }
    }
    
  }
}
