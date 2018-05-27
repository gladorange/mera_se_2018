package los.task1;


// как вариант, можно было бы реализовать этот класс лямбдой, т.к. в методе run всего одна инструкция.
public class ReaderFilesWritingToCollectionsThreads extends Thread
{
    ReaderFilesWritingToCollections readerFiles;

    public ReaderFilesWritingToCollectionsThreads(ReaderFilesWritingToCollections readerFiles)
    {
        this.readerFiles = readerFiles;
    }

    @Override
    public void run ()
    {
        this.readerFiles.readFile();
    }
}