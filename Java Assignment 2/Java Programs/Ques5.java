//Ques 5 program to show the different types of constructors available in java and their scope.
class sub{
    int id = 1;
    String name = " No Argument Constructor";
    sub(){
        System.out.println("This is No Argument constructor.");
    }
    sub(String name, int id){
        this.name = name;
        this.id = id;
        System.out.println("\nThis is Parameterized Constructor");
    }
}
public class Ques5{
    int a = 3;
    String type = "Default Constructor";
    public static void main(String[] args) {
        sub c = new sub();
        System.out.println("Type = " + c.id + " Conctructor Name = " + c.name);
        //System.out.println(c.name);
        sub c2 = new sub("Parameterized Constructor", 2);
        System.out.println("Type = " + c2.id + " Conctructor Name = " + c2.name);
        Ques5 c3 = new Ques5();
        System.out.println("\nThis is Default Constructor");
        System.out.println("Type = " + c3.a + " Conctructor Name = " + c3.type);
    }
}
