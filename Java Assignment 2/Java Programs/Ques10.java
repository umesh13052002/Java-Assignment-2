//Ques 10  program in java to show Inheritance and its types.
class parent{
    double num1 = 300*9.85;
    void msg1(){
        System.out.println("Simple Inheritance");
    }
    void msg2(){
        double num3 = 65412/8782*85+1;
        System.out.println("Num3 = "+num3);
    }
}
class child1 extends parent{
    double num2 = 3000*6;
    void eg(){
        System.out.println("\nMultilevel Inheritance");
    }
}
class child2 extends child1{
    void eg1(){
        System.out.println("This is for reference");
    }
}

class Student{  
    public void methodStudent(){  
        System.out.println("The method of the class Student invoked.");
    }  
}  

class Science extends Student{
    public void methodScience(){
        System.out.println("The method of the class Science invoked.");  
    }  
}

class Commerce extends Student{
    public void methodCommerce(){  
        System.out.println("The method of the class Commerce invoked.");  
    }
}

class Arts extends Student{
    public void methodArts(){  
        System.out.println("The method of the class Arts invoked.");  
    }
}

class student1 extends Arts{
    public void fineArts(){
        System.out.println("\nThis is invoked in Student1 to show Hybrid Inheritance");
        System.out.println("Hybrid Inheritance is one which combines all types of Inheritacne mentioned above");
    }
}
public class Ques10 {
    public static void main(String[] args) {
        child1 obj = new child1();
        obj.msg1();
        System.out.println("Num2 = " + obj.num1);
        System.out.println("Num2 = " + obj.num2);
        child2 obj2 = new child2();
        obj2.eg();
        obj2.msg2();
        System.out.println("\nThis is Hirarchical Inheritance");
        Science sci = new Science();  
        Commerce comm = new Commerce();  
        Arts art = new Arts();  
        //all the sub classes can access the method of super class  
        sci.methodStudent();  
        comm.methodStudent();  
        art.methodStudent();  
        student1 st = new student1();
        st.fineArts();
        st.methodStudent();
    }
}
