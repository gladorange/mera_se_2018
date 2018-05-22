package src;

public class ReaderTread extends Thread {
    Reader reader;


    public ReaderTread(Reader reader) {
        this.reader= reader;
    }

    @Override
    public void run () {
        this.reader.read();
    }
}
