package src;

public class Name implements Details {
    String name;
    int age;
    public Name(String name ,int age) {
        this.name = name;
        this.age = age;
    }

    public void myName(){
        System.out.println(name);
    }

    public void Age(){
        System.out.println(age);
    }
}
