package los.task1;

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