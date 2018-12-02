package classin.chengyuan;

class Outer {
    private int num=4;
    public void test(){
        Inner in=new Inner();
        in.show();
    }

    class Inner{
        void show(){
            System.out.println("num="+num);
        }
    }
}
