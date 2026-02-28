package abstraction;

abstract class Animal {
//Normal or Concrete Methods
//    Abstract Methods
    void eat(){
        System.out.println("Animals eat some food!");
    }
//    this method cannot have a body
//    it will be implemented in the child classes
    abstract void run();
//    If an abstract class has only abstract methods
//    It is 100% abstraction
//    IF it has even 1 normal method-it is not 100%
}
class Cat extends Animal{
    @Override
    void run(){
        System.out.println("Cats run fast.");
    }
}
class Cheetah extends Animal{
    @Override
    void run(){
        System.out.println("Cheetah run very fast.");
    }
}
class Demo{
    public static void main(String[] args) {
        Cheetah cheetah=new Cheetah();
        Cat cat=new Cat();
        cat.eat();
        cat.run();
        cheetah.eat();
        cheetah.run();
    }
}