package src;

public class Person implements Comparable<Person>{
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Person p) {
        //System.out.println("This: " + this.name + "P: " + p.name + "return " + this.name.compareTo(p.name));
        return this.name.compareTo(p.name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
