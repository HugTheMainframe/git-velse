public class Cat extends Animal{

    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public boolean eat(String catFood){
        return true;
    }

    @Override
    public void showMood(boolean mood){
        if(mood){
            System.out.println("spinder");
        } else {
            System.out.println("hvæser");
        }
    }
}
