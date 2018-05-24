package los.task1;

public class Zebra extends Animal
{
    private static final int DEFAULT_NUMBER_STRIPS = 70;
    private int numberStrips;

    public Zebra(String name, int numberStrips)
    {
        super(name);
        this.numberStrips = numberStrips;
    }

    public int getNumberStrips()
    {
        return numberStrips;
    }

    @Override
    public void sayHello()
    {
        String postfix;

        if(numberStrips > DEFAULT_NUMBER_STRIPS)
        {
            postfix = "С большим количеством плосок";
        }
        else
        {
            postfix = " ";
        }

        System.out.printf("Иго-го, я зебра %s. %s%n", this.getName(), postfix);
    }

    @Override
    public boolean equals(Object ob)
    {
        if(this == ob)
        {
            return true;
        }

        return (null != ob)
                && (ob instanceof Zebra)
                && (super.equals((Animal)ob))
                && (((Zebra)ob).numberStrips == this.numberStrips);
    }
}