package Questions;


interface BasicAniaml{
    void eat();
    void sleep();
}
public class Monkey {
    void jump(){
        System.out.println("Monkeys are jumping...");
    }
    void bite(){
        System.out.println("Monkeys are biting...");
    }
}


class Human extends Monkey implements BasicAniaml{

    @Override
    public void eat() {
        System.out.println("Monkeys are eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Monkeys are sleeping...");
    }
}

