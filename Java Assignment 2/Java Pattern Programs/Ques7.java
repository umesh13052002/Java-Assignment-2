//Ques 7
public class Ques7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println();
            System.out.println();
            for (int j = 1; j <= 5 ; j++) {

                if (i == j) {
                    System.out.print(i + " ");
                } else {
                    System.out.print(1 + " ");
                }
            }
        }
    }    
}
