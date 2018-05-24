package telukhin.task1;

public class Dog extends Animal {
    private int volumeVoice;

    public Dog(String name, int volumeVoice) {
        super(name);
        this.volumeVoice = volumeVoice;
    }

    @Override
    void sayHello() {
        if (volumeVoice > 5) {
            System.out.println(String.format("Гав, я собака с громким голосом. Громкость %s", volumeVoice));
        }
    }
}
