public class ex3 {

           int a = 10;// nii h stc
    static int v = 12;

        // ye wala stc h
    static  void fun1(){
//        a = 12;  // we can not access bcoz a is not static variable
        v=15;
    }


    // ye wala stc nii h
    void fun2(){
       a=15;
        v =19;
    }

    public static void main(String[] args) {
       fun1();
       ex3 obj = new ex3();
       obj.fun2();

    }



}