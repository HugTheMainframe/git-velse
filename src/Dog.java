public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("wof");
    }

    @Override
    public boolean eat(String dogFood){
        return true;
    }
}
