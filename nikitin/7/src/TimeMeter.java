package src;

import java.util.Collection;


public class TimeMeter <DATA, CONTAINER extends Collection<DATA>> {
    private Class<DATA> dataType;
    private Class<CONTAINER> collectionType;
    private CONTAINER collection;

    public TimeMeter(Class<DATA> dataType, Class<CONTAINER> collectionType) {
        this.collectionType = collectionType;
        this.dataType = dataType;
        this.collection = getNewCollection();

        //System.out.println(String.format("Collection %s<%s> is created",
        //        this.collection.getClass().getSimpleName(), getTypeName()));
    }

    public String getTypeName() {
        return dataType.getSimpleName();
    }

    public CONTAINER getNewCollection() {
        try {
            return collectionType.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public long additionTest(int number) {
        long before = System.nanoTime();

        switch (getTypeName()) {
            case "Integer":
                for (int i = 0; i < number; i++) {
                    this.collection.add((DATA)new Integer(i));
                }
                break;
            case "Long":
                for (int i = 0; i < number; i++) {
                    this.collection.add((DATA)new Long(i));
                }
                break;
            case "String":
                for (int i = 0; i < number; i++) {
                    this.collection.add((DATA)new String(String.valueOf(i)));
                }
                break;
            case "Person":
                for (int i = 0; i < number; i++) {
                    this.collection.add((DATA)new Person(String.valueOf(i)));
                }
                break;

        }
        //System.out.println(this.collection);
        return (System.nanoTime() - before);
    }

    public long searchTest(DATA value) {
        long before = System.nanoTime();

        Boolean result = this.collection.contains(value);
        if (result) {
            //System.out.println(String.format("Searching for %s<%s> in collection<%s>. Result: %s",
            //        value, value.getClass().getSimpleName(), collection.getClass().getSimpleName(), result));
        }
        return (System.nanoTime() - before);
    }

}

