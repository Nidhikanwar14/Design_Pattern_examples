package Questions;

abstract public class Telephone {

    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}

class SmartTelephone extends Telephone{
    void ring(){
        System.out.println("Phone is ringing..");
    }
    void lift(){
        System.out.println("lift..");
    }
    void disconnect(){
        System.out.println("Phone disconnect..");
    }
}