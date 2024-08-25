interface Printable{
    void print();
}

interface Showable{
    void show();
}

 class Multipleinheritance implements Printable,Showable{                 
    public void print(){                           //they should  be public because visibilty jyada rkhni h
        System.out.println("print");
    }
   public void show(){
        System.out.println("show");
        
    }
    public static void main(String[] args) {
        Multipleinheritance obj=new Multipleinheritance();
        obj.print();
        obj.show();
    }
}
