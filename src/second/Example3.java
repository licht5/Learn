package second;

public class Example3 {
    public static void main(String[] args){
        Single s1=Single.getInstance();
        Single s2=Single.getInstance();


        System.out.println("add");
        System.out.println(s1==s2);

    }
}
