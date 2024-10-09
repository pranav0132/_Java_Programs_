class Animal{
    void eat(){
        System.out.println("eating");
    }
}

class dog extends Animal{
    void eat(){
        System.out.println("Eating Fruits");
    }
}
class babydog extends dog{
    void eat(){
        System.out.println("Drinking Milk");
    }
}

public class exp10_3 {
    public static void main(String[] args) {
        Animal a1,a2,a3;
        a1 = new Animal();
        a2 = new dog();
        a3 = new babydog();
        a1.eat();
        a2.eat();
        a3.eat();
    }
}
