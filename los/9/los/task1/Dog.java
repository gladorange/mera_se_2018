package los.task1;

@AnimalDescription(value = "Собака есть единственное животное, верность которого непоколебима.")
public class Dog extends Animal
{
    private static final int DEFAULT_BARKING_VOLUME = 7;
    private int barkingVolume;

    public Dog(String name, int barkingVolume)
    {
        super(name);
        this.barkingVolume = barkingVolume;
    }

    public int getBarkingVolume()
    {
        return barkingVolume;
    }

    @Override
    public void sayHello()
    {
        String postfix;

        if(barkingVolume > DEFAULT_BARKING_VOLUME)
        {
            postfix = "Громко лаю";
        }
        else
        {
            postfix = " ";
        }

        System.out.printf("Гав, я собака %s. %s%n", this.getName(), postfix);
    }

    @Override
    public boolean equals(Object ob)
    {
        if(this == ob)
        {
            return true;
        }

        return (null != ob)
                && (ob instanceof Dog)
                && (super.equals((Animal)ob))
                && (((Dog)ob).barkingVolume == this.barkingVolume);
    }
}
