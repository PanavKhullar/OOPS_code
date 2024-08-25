// class Shape{
//     public void area(){
//         System.out.println("Displays area");
//     }


// }
// class Triangle extends Shape{
//     public void area(int l,int h){
//         System.out.println(0.5*l*h);
//     }
// }

// public class single_inheritance {
//     public static void main(String[] args) {
//         Triangle t=new Triangle();
        
//         t.area(2,4);
//     }
// }

class Animal{
    int a;
    void eat(){
        System.out.println("eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
public class single_inheritance {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.bark();
        d.eat();
        d.a=2;
        System.out.println(d.a);
    }
}