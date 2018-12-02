package second;

public class Exp {
    public static void main(String[] args){
        Exa e1=new Exa("licht",20);
        Exa e2=new Exa("tfh");
        e1.spe();
        e2.spe();
    }
}

class Exa{
    int age;
    String name;;
    public Exa(String name){
        this.name=name;

    }
    public Exa(String name,int age){
        this.age=age;
        this.name=name;
    }

    public void spe(){
        System.out.println("i am "+age+" i am "+name);
    }
}
