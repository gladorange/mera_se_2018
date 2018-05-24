package los.task1;

import java.util.Objects;

public abstract class Animal
{
    private String name;

    public Animal(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public abstract void sayHello();

    @Override
    public boolean equals(Object ob)
    {
        if(this == ob)
        {
            return true;
        }

        return (null != ob)
                && (ob instanceof Animal)
                && (((Animal)ob).name.equals(this.name));
    }
}