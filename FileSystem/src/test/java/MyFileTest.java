import edu.bu.metcs.MyFileSystem.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class MyFileTest {
    private MyFileSystem myFileSystem;
    private MyFileSysInfoView myFileInfoView;
    private MyFileSysDetailView myFileDetailView;


    @BeforeEach
    public void setup(){
        myFileSystem = new MyFileSystem();
        myFileInfoView = new MyFileSysInfoView(myFileSystem);
        myFileDetailView = new MyFileSysDetailView(myFileSystem);

   }

    @Test
    public void testObservers(){
        MyFile myFile1 = new MyFile("file1", 1000);
        myFileSystem.add(myFileSystem.getRoot(), myFile1);
        assertEquals("Files: file1", myFileInfoView.listFiles(), "test infoview");
        assertEquals("Files:\nfile1", myFileDetailView.showFileDetail(), "test detailview");

        myFileSystem.changeFileName(myFile1, "file2");
        assertEquals("Files: file2", myFileInfoView.listFiles(), "test infoview");
        assertEquals("Files:\nfile2", myFileDetailView.showFileDetail(), "test detailview");
    }

    @Test
    public void testStrategyPattern(){
        MyFile myFile1 = new MyFile("file1", 1000);
        myFile1.setContent("aaa");
        myFileSystem.setSecurityLevel(myFile1, MyFileSystem.HIGH_SECURITY);
        myFile1.encrypt();
        assertEquals("AESaaa", myFile1.getContent(), "encryption");

        MyFile myFile2 = new MyFile("file2", 1000);
        myFile2.setContent("bbb");
        myFileSystem.setSecurityLevel(myFile2, MyFileSystem.LOW_SECURITY);
        myFile2.encrypt();
        assertEquals("Twofishbbb", myFile2.getContent(), "encryption");
    }

    @Test
    public void testCompositePattern(){
        MyFile myFile1 = new MyFile("file1", 1000);
        myFileSystem.add(myFileSystem.getRoot(), myFile1);

        MyFolder myFolder = new MyFolder("folder1");
        MyFile myFile2 = new MyFile("file2", 1000);
        myFileSystem.add(myFileSystem.getRoot(), myFile1);
        myFileSystem.add(myFileSystem.getRoot(), myFolder);
        myFileSystem.add(myFolder, myFile2);

        myFolder.changeOwner("danazh");
        assertEquals("root", myFile1.getOwner());
        assertEquals("danazh", myFile2.getOwner());
    }
}
