package classin.fangfa;

public class Outer {
    private int num=4;
    public void test(){
        class Inner{
            void show(){
                System.out.println("inner");
            }
        }
        Inner in =new Inner();
        in.show();
    }
}
