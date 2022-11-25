import java.io.Serializable;
import java.lang.reflect.*;
import java.io.*;

class Demo implements Serializable {
    public int i;
    public String s; 

    public Demo(int i, String s){//Default constructor
        this.i = i;
        this.s = s;
    }
}
public class Ques1 implements Cloneable{
    String str = "Hello World!";

    //for clone method start
    protected Object clone() throws CloneNotSupportedException{
        return super.clone(); 
    }
    String name = "Java program Ques 1";
    //for clone method end

    public static void main(String[] args) {
        Ques1 o1 = new Ques1();
        System.out.println("Java program to create objects using different methods of creation of the object.\n");
        //method 1
        System.out.println("Method 1 Java New Operator\n"+ o1.str);
        // method 2
        try {
            Ques1 o2 = new Ques1();
            System.out.println("\nMethod 2 Java Class.newInstance() method\n" + o2.str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //method 3
        try {
            Constructor<Ques1> o3 = Ques1.class.getConstructor();
            Ques1 o31 = o3.newInstance();
            System.out.println("\nMethod 3 Java newInstance() method of Constructor class\n" + o31.str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //method 4
        Ques1 o4 = new Ques1();
        try {
            Ques1 o41 = (Ques1) o4.clone();
            System.out.println("\nMethod 4 Java Object.clone() method\n" + o41.name);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //method 5
        System.out.println("\nMethod 5 Java Object Serialization and Deserialization");
        Demo o5 = new Demo(5, "Method 5 Java Object Serialization and Deserialization");
        String fileName = "Demofile.ser";
        try {
            FileOutputStream file = new FileOutputStream(fileName);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(o5);
            out.close();
            file.close();
            System.out.println("\nObject Serialized");
        } catch (IOException e) {
            // TODO: handle exception
            e.printStackTrace();
        }

        Demo o51 = null;
        try {
            FileInputStream file = new FileInputStream(fileName); // reading an object from a file   
            ObjectInputStream is = new ObjectInputStream(file);   
            o51 = (Demo)is.readObject();        //deserialize object  
            is.close();                     //closes the ObjectInputStream  
            file.close();                   //closes the file  
            System.out.println("Object Deserialized ");   
            System.out.println("number = " + o51.i);   
            System.out.println("string = " + o51.s);   
        } catch (IOException e) {
            System.out.println("IOException is caught");   
        }   
        catch(ClassNotFoundException e)   
        {   
            System.out.println("ClassNotFoundException is caught");   
        }  
    }    
}
