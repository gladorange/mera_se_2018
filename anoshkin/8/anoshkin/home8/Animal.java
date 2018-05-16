package anoshkin.home8;

public abstract class Animal {
    private String name="NoName";
    public abstract void sayHello();
    public Animal(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
