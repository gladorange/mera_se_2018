package telukhin.task1;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void sayHello() {
        System.out.println("Я - прородитель всех животных");
    }
}
