public class ex8 {
    public static void main(String[] args) {
        akr obj = new akr();
        obj.fun1(5);
    }
}

class  akr{
    int a , b;


    void fun1(int a){

        System.out.println(this.a+"--->"+a);

    }



    akr(){
        this.fun1(this.a);
    }
}
