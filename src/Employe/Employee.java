package Employe;

public class Employee {

    int number;
    int age;
    String name;

    public Employee(String emname,int emage,int emnumber){
        this.name=emname;
        this.age=emage;
        this.number=emnumber;
    }

    public void printInfo(){
        System.out.println("age:"+age);
        System.out.println("number:"+number);
        System.out.println("name:"+ name);


    }

}
