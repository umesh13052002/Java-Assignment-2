//Ques 8 program in java to show the static import of packages, System classes, Print stream classes, Object classes, etc.
// Java to illustrate calling of static member of
// System class without Class name
// static import of packages
import static java.lang.Math.*; 
//static import of system class
import static java.lang.System.*;
//PrintStream Class
import java.io.*;
//Object Class 
import java.lang.Object;

public class Ques8 {

    public static void main(String[] args)throws Exception{
		// We are calling static member of System class
		// directly without System class name
        out.println("\nStatic import of class allows us to access the static members of a class directly without class name or any object");
		out.println(sqrt(4));
		out.println(pow(2, 2));
		out.println(abs(6.3));
        

        String data = "This is a text inside the file.";
        try {
            PrintStream output = new PrintStream("output.txt");

            output.println(data);
            output.println("Hello World");
            output.close();
        }
        catch(Exception e) {
            e.getStackTrace();
        }
        Object s = new String("This is object class");
        //s.getClass();
        out.println(s.getClass());

        Object obj = new Object();
        System.out.println(obj.toString());
	}
}
