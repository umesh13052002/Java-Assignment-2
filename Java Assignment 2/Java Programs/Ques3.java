//Ques 3
class sub1 {
    public static void main(String[] args) {
        System.out.println("Main Method String Array");
    }    
    static public void main2(String[] args)
    {
        System.out.println("Main Method different order of modifiers");
    }
    public static void main3(String args[])
    {
        System.out.println("Main Method different position of [] brackets");
    }
    public static void main4(String[] JavaPrograms){
        System.out.println("Instead of args we have written JavaPrograms");
    }
    final public static void main5(String... args){
        System.out.println("Var-args main method");
    }
    public static void main6(final String[] args){
        System.out.println("Main Method final modifier");
    }

    final public static void main7(String[] args){
        System.out.println("final main method");
    }
    public synchronized static void main8(String[] args)
    {
        System.out.println("Synchronized Main Method");
    }
    public static void main(int[] a)
    {
        System.out.println("Main Method int Array");
    }
}

public class Ques3 {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        String[] s = {"a","b"};
        sub1.main(s);
        sub1.main(a);
        sub1.main2(null);
        sub1.main3(args);
        sub1.main4(null);
        sub1.main5(args);
        sub1.main6(args);
        sub1.main7(args);
        sub1.main8(args);
    }    
}
