//Ques 7 program in java to show the access specifiers with instance variables, local variables, anonymous blocks, and static blocks.
public class Ques7 {

    //Access Specifiers with instance variable
    // the instance variable name is visible for any child class.
    public String name;
    // the grade variable is visible in Student class only.
    private double grade;

    protected double total;
    // The value for the name variable is assigned in the constructor 
    public Ques7 (String stdName) {
        name = stdName;
    }
    // The variable grade is assigned a value now 
    public void setgrade(double stdgrade) {
        grade = stdgrade;
    }
    //The following method will print the details of the Student
    public void printstd() {
        String s = "This is local variable";
        System.out.println("name  : " + name );
        System.out.println("grade : " + grade);
        System.out.println(s);
    }
    //Anonymous Block
    {
		System.out.print("This is Anonymous Block\n");
	}
    //Static Block
    static {
		System.out.println("First static block is initialized");
	}
	
	static {
		System.out.println("Second static block is initialized");
	}
    public static void main(String[] args) {
        Ques7 o1 = new Ques7("Harshit");
        o1.setgrade(90);
        o1.printstd();
    }
}