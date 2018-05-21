package zudin.task9;

public abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name){
    this.name = name;
   }

   public abstract String getParameter();

}
