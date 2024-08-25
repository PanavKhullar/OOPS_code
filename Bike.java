class Vehicle{
    void run(){
        System.out.println("vehicle is running safely");
    }
}

public class Bike extends Vehicle{
    void run(){
        System.out.println("bike is running");
    }
    public static void main(String[] args) {             //here we want run to print something
        Bike b=new Bike();
        b.run();
    }
}