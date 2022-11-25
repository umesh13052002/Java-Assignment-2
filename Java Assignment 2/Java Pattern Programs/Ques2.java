import java.util.*;

//Ques 2 print the pattern
//MainFunction
public class Ques2{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows :- ");
		int row = sc.nextInt(); // Number of Rows we want to print		
		//Printing the pattern
        for (int i = 1; i <= row; i++){
            System.out.println();
            for (int j = 1; j<i; j++){
                System.out.print("  ");
            }
            for (int k = row; k >= i; k--){
                System.out.print("* ");
            }
            System.out.print("Hello ");
            for(int j = row; j>=i; j--){
                System.out.print("* ");
            }
            sc.close();
        }
    }            
}
