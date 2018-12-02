package second;



public class Example1 {
    public static void main(String[] args){
        Perso p1=new Perso();
        Perso p2=new Perso();
        p1=null;
        p2=null;
        System.gc();
        for (int i=0;i<1;i++){

        }


    }
}

class Perso{
    public void finalize(){
        System.out.println("gcda");
    }
}
