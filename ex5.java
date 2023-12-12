public class ex5 {
    public static void main(String[] args) {

    }
}


class  b2{
  protected    int a = 4;
    class c2{
        void fun1()
        {
            a= 12;
        }

    }

    void funa3(){
        a = 20;
    }


}

class  a3 extends  b2{
    void fun4(){

        b2 obj = new b2();
        obj.a= 12;
    }
    
}