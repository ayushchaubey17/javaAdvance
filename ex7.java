public class ex7 {
   static int a;

  static
  {
      System.out.println(a);
      a =12;
  }



    public static void main(String[] args) {
     final int b;
     b =12;

     ex7 obj = new ex7();
int arr[] = new int[3];
        System.out.println("the value is"+arr[0]+" "+b);
    }
}

class ram{

    class  a1{

    }
    class a2 extends  a1{

    }
    final class  a3 extends a2{

    }

}