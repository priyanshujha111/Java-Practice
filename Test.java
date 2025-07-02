class Animal {  
    void eat() {  
        System.out.println("This animal eats food.");  
    }  
}  

class Dog extends Animal {  
    void bark() {  
        System.out.println("The dog barks.");  
    }  
}  

class Puppy extends Dog {  
    void weep() {  
        System.out.println("The puppy weeps.");  
    }  
}  

public class Test {  
    public static void main(String[] args) {  
        Puppy p = new Puppy();  
        p.eat();  // Inherited from Animal
        p.bark(); // Inherited from Dog
        p.weep(); // Own method
    }  
}
