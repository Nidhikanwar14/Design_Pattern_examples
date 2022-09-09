package Questions;

abstract class Pen {
   abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{

    @Override
    void write() {
        System.out.println("write...");
    }

    @Override
    void refill() {
        System.out.println("refill...");
    }

    void changeNib(){
        System.out.println("ChangeNib...");
    }

}


public class Question {
    public static void main(String[] args){
     FountainPen pen = new FountainPen();
     pen.changeNib();
    }

}

