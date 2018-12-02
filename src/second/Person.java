package second;

class Person {
     private int age;
     private String name;

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         if (age<0){
             System.out.println("年龄不合法……");
         }
         else {
             this.age = age;
         }

     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }


    public void introduce(){
        System.out.println("i am "+name+", i am "+age+" years old");
    }

    public Person(){
         System.out.println("无参的构造方法调用了……");
    }
}


