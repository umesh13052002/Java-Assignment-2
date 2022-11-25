//Ques 6 program in java to show the different access specifiers available in java. 
class A {
    private String sType = "\nType 1 Private Specifier";
    private void msg(){
        String s = sType;
        System.out.println(s);
    }
    public void toDisplayPrivate(){
        A o = new A();
        o.msg();
    }
    void msg2(){
        System.out.println("Type 2 Default Specifier");
    }
    protected void msg3(){
        System.out.println("Type3 Protected Specifier");
    }
    public void msg4(){
        System.out.println("Type 4 Public Specifier");
    }
}
public class Ques6 extends A{
    public static void main(String[] args) {
        A obj = new A();
        obj.toDisplayPrivate();
        System.out.println("The Private Specifier can only be accessed within the class it is created nowhere else\n");

        obj.msg2();
        System.out.println("If no specifier is used it is treated as default it is accessible in pakages\n");
        
        obj.msg3();
        System.out.println("Protected Specifier is only accessible through inheritance\n");
        
        obj.msg4();
        System.out.println("Public Specifier is accessible everywhere\n");
    }
}
