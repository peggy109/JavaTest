public class IsATest {
public static void main(String[] args) {
    Dog dog = new Dog();
    System.out.println("dog is Animal(super class)?:"+(dog instanceof Animal));
    System.out.println("dog is Fruit(interface)?:"+(dog instanceof Fruit));
}
}
