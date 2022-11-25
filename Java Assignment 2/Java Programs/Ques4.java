//Ques 4 program in java to show abstraction.

abstract class A1{   
    abstract int getRateOfInterest();    
}
class B1 extends A1{    
    int getRateOfInterest(){
        return 7;
    }
}    
class C1 extends A1{
    int getRateOfInterest(){
        return 8;
    }    
}    

public class Ques4{
    public static void main(String args[]){
        A1 ob;
        ob = new B1();  
        System.out.println("Rate of Interest is: "+ob.getRateOfInterest()+" %");    
        ob = new C1();  
        System.out.println("Rate of Interest is: "+ob.getRateOfInterest()+" %");
    }
}    