// outer class ----> top level class
public  class ex4 {
    int a = 45;   //instance variable
    static  int b = 12;  //static variable
    void fun1(){}      // non - static
    static  void  fun2(){}  // static



    //non static nested classs//inner class
    class a1{
        void  func(){
          a=12;
          b=23;
          fun2();
          fun1();
      }

    }

    public static void main(String[] args) {

    }





}