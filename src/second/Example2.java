package second;

public class Example2 {
    static {
        System.out.println("test 静态代码块执行了");
    }
    public static void main(String[] args){
        People p1=new People();
        People p2=new People();


    }
}

class People{
    static String country;
    static {
        country="china";
        System.out.println("静态代码块执行了……");
    }
}
