public class Bird extends Animal {
    public Bird (String name, String family){
        super(name,family);
    }
    @Override 
    public void makeSound(){
        System.out.println("Tweet tweet");
    }
}
