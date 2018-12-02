package second;

public class staticTes {
    public static void main(String[] args){
        staticDemo s1=new staticDemo();
        staticDemo.schoolname="hust";
        System.out.println(staticDemo.schoolname);
        System.out.println(s1.schoolname);
        staticDemo.pri();
        s1.pri();
    }
}
