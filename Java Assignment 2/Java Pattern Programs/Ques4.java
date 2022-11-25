import java.util.*;
//Ques 4
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows :- ");
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");
            }
        }
        sc.close();
    }
}
