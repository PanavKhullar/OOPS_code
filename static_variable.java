class Counter{
   static int count=0;     //will get memory only once and retain its value  and if i remove static then each time new

    Counter(){
        count++;
        System.out.println(count);
    }
}

public class static_variable {
    public static void main(String[] args) {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();

    }
}
