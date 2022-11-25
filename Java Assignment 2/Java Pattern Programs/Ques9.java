//Ques 9
public class Ques9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            for (int k = i+1; k <= 5; k++) {
                System.out.print(1);
            }
        }
    }
}
