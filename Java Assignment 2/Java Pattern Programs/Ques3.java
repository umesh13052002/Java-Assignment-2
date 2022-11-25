import java.util.*;
//Ques 3
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :- ");
        int rows = sc.nextInt();
        for (int i = 1; i <= rows; i++) {
            System.out.println();
            System.out.println();
            for(int j = rows; j>=i-6; j--){
                System.out.print("*");
            }
            sc.close();
        }
    }    
}