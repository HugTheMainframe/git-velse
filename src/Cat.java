public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public boolean eat(String catFood){
        return true;
    }
}
