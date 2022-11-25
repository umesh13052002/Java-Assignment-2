//Ques 2 program to show the nesting of classes in java using five classes.
class A {
    int i = 1;
    void numinA(){
        System.out.println("Integer in A = " + i);
    }
    class B {
        int j = 2;
        void numinB(){
            System.out.println("Integer in B = " + j);
        }
        class C {
            int k = 3;
            void numinC(){
                System.out.println("Integer in C = " + k);
            }
            class D {
                int l = 4;
                void numinD(){
                    System.out.println("Integer in D = " + l);
                }
                class E {
                    int m = 5;
                    void numinE(){
                        System.out.println("Integer in E = " + m);
                    }
                }
            }
        }
    }
}

public class Ques2 {
    public static void main(String[] args) {
        A objA = new A();
        A.B objB = objA.new B();
        A.B.C objC = objB.new C();
        A.B.C.D objD = objC.new D();
        A.B.C.D.E objE = objD.new E();

        objA.numinA();
        objB.numinB();
        objC.numinC();
        objD.numinD();
        objE.numinE();
    }
}
