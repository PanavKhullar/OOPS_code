abstract class Animal{
     abstract void walk();  //yha pe walk likha taaki har iski subclass walk method likhe but hme animal ka ni pta kyuki vo ek concept h specific ni h
}

class Horse extends Animal{
    void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("walks on 2 legs");

    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse=new Horse();
        
        horse.walk();
    }
}
