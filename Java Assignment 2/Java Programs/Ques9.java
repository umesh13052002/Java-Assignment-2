//Ques 9 program in java to show the compile time and run time polymorphism.
class bike{
    void run(){
        System.out.println("Running");
    }
}
public class Ques9 extends bike{
    void run(){
        System.out.println("Running Safely at 60kmph");
    }
    void show(int num1){
        System.out.println("Number 1 : " + num1);
    }
    void show(int num1, int num2){
        System.out.println("Number 1 : " + num1 + " Number 2 : " + num2);
    }
    public static void main(String[] args) {
        System.out.println("\nRuntime Polymorphism");
        bike b = new Ques9();
        b.run();
        System.out.println("\nCompile Time Polymorphism");
        Ques9 obj = new Ques9();
        obj.show(3);
        obj.show(4, 5);
    }
}
