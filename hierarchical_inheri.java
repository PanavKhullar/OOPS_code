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

class Cat extends Animal{
    void meow(){
        System.out.println("meowing");
    }
}

public class hierarchical_inheri {
    public static void main(String[] args) {
        Cat c=new Cat();

        c.meow(); 
        c.eat();

    }
}


// class Student{
//     int rollno;
// }
// class Male extends Student{
//     void boy(){
//         System.out.println("i am a boy");
//     }
// }

// class Female extends Student{
//     void girl(){
//         System.out.println("i am a girl");
//     }
// }

// public class hierarchical_inheri {
//     public static void main(String[] args) {
//         Female fs=new Female();
       
        
//         fs.girl();
//         fs.rollno=12;
//         System.out.println(fs.rollno);
//     }
// }
