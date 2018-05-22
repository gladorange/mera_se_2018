package src;



public class App 
{
    public static void main( String[] args ) throws Throwable
    {
        try {
            Reader a = new Reader("jdk-8u171-windows-x64.exe");
            Reader b = new Reader("AFF.docx");
            Reader c = new Reader("HFS.zip");

            System.out.println("Sync reading: ");
            long before = System.nanoTime();
            a.read();
            b.read();
            c.read();
            System.out.println("\tTime total: " + (System.nanoTime() - before));

            //a.refresh();
            //b.refresh();

            Reader d = new Reader("jdk-8u171-windows-x64.exe");
            Reader e = new Reader("AFF.docx");
            Reader f = new Reader("HFS.zip");

            Thread dd = new ReaderTread(d);
            Thread ee = new ReaderTread(e);
            Thread ff = new ReaderTread(f);

            System.out.println("Async reading: ");
            before = System.nanoTime();
            dd.start();
            ee.start();
            ff.start();

            dd.join();
            ee.join();
            ff.join();
            System.out.println("\tTime total: " + (System.nanoTime() - before));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
