package los.task1;

public class Cat extends Animal
{
    private static final int DEFAULT_LENGTH_MUSTACHE = 5;
    private int lengthMustache;

    public Cat(String name, int lengthMustache)
    {
        super(name);
        this.lengthMustache = lengthMustache;
    }

    public int getMustacheLength()
    {
        return lengthMustache;
    }

    @Override
    public void sayHello()
    {
        String postfix;

        if(lengthMustache > DEFAULT_LENGTH_MUSTACHE)
        {
            postfix = "C длинными усами";
        }
        else
        {
            postfix = " ";
        }

        System.out.printf("Мяу, я кот %s. %s%n", this.getName(), postfix);
    }

    @Override
    public boolean equals(Object ob)
    {
        if(ob == this)
        {
            return true;
        }

        return (null != ob)
                && (ob instanceof Cat)
                && ((super.equals((Animal)ob)))
                && (((Cat)ob).lengthMustache == this.lengthMustache);
    }
}