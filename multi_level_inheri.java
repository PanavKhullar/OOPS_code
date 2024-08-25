class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}

class BabyDog extends Dog{
    void cry(){
        System.out.println("crying");
    }

}
public class multi_level_inheri {
    public static void main(String[] args) {
        BabyDog bd=new BabyDog();
                                        //   as here  babydog class all properties of parent classes
        bd.cry();
        bd.eat();
        bd.bark();
    }
}
