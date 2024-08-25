// by no of arguments

// class Adder{
//    static int add(int a,int b){
//         return a+b;
//     }
//    static int add(int a,int b,int c){
//         return a+b+c;
//     }
// }
// public class method_overloading {
//     public static void main(String[] args) {
//         // Adder a=new Adder();
//         // int l=a.add(1, 2);
//         // int b=a.add(3, 4, 1);
//         // System.out.println(l);         // we are creating static methods so that we don't need to create instance for calling methods like this
//         // System.out.println(b);

//         System.out.println(Adder.add(1,2));
//         System.out.println(Adder.add(1,2,3));

//     }
// }

// BY CHANGING DATA TYPE OF ARGUMENTS

class Adder{
    static int add(int a,int b){
        return a+b;
    }

    static double add(double a,double b){
        return a+b;
    }
}
public class method_overloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(1, 3));
        System.out.println(Adder.add(1.6, 3.4));

    }
}