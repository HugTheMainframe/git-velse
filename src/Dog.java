public class Dog extends Animal{

    @Override
    public void makeSound() {
        System.out.println("wof");
    }

    @Override
    public boolean eat(String dogFood){
        return true;
    }

    @Override
    public void showMood(boolean mood){
        if(mood){
            System.out.println("logre");
        } else {
            System.out.println("knurre");
        }
    }
}
