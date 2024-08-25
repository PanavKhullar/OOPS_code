class Student{
    int id;
    String name;
    int age;

    Student(int i,String n){            //parameterized constructor
        id=i;
        name=n;        
    }

    Student(int i,String n,int a){          
        id=i;
        name=n;     
        age=a;   
    }
    void display(){
        System.out.println(id+" " + name + " " + age);
    }
}
public class constructor_overloading {


public static void main(String[] args) {
    Student s1=new Student(1,"panav",100);
    Student s2=new Student(2,"nikhil");
s1.display();
s2.display();

    


}    
}
