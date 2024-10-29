class Animal{
    void sound(){
        System.out.println("they makes sound...");
    }
    void sleep(){
        System.out.println("they sleep normally...");
    }
}
public class single_inheritance extends Animal{
    public void bark(){
        System.out.println("this animal is a dog...");
    }
    public void sleep(){
        super.sleep();
        System.out.println("dog generally sleep at night...");
    }

    public static void main(String[] args){
        Animal x=new Animal();
        x.sound();
        x.sleep();

        single_inheritance dog=new single_inheritance();
        dog.bark();
        dog.sound();
        dog.sleep();

    }
}
