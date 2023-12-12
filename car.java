public class car {
    int engine;
   static int wheel =4;



  static void fun2(){
     int b =10;    // instance variable

   }



    public static void main(String[] args) {


        car bmw = new car();  // 6
        car odi = new car();  //6
        car thar = new car(); //6

       bmw.engine = 10000;
        odi.engine = 7000;
        thar.engine = 30;
        thar.wheel =6;


    }


}
