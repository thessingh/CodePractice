public class Student {
    String name;
    int age;

    void display(){
        System.out.println("My name is "+this.name+". I am "+this.age+" years old");
    }

    void sayHello(String name){
        System.out.println(this.name+" says hello to "+name);
    }
}