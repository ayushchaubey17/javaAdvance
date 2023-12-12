public class ak1 {
    int a;              // instance(object) variable
    int b = 5;       // static variable----> bs ak baar bnega


    public static void main(String[] args) {
        ak1 obj1 = new ak1();  //a
        ak1 obj2 = new ak1();  //a
        ak1 obj3 = new ak1();   //a
        obj1.a =5; obj2.a= 10; obj3.a =78;


        System.out.println(obj3.b);


    }



}
