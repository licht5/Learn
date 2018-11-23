package first;

public class Puppy {

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    int age;
    public Puppy(String name){
        System.out.println("dog name:"+name);
    }

    public static void main(String[] args){
        Puppy puppy=new Puppy("xiaominhg");
        puppy.setAge(7);
        System.out.println(puppy.getAge());

    }
}