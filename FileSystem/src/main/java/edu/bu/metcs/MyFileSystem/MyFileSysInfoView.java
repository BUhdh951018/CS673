package edu.bu.metcs.MyFileSystem;

public class MyFileSysInfoView implements Observer {
    MyFileSystem myFileSystem;
    String fileInfo = "";

    public MyFileSysInfoView(MyFileSystem aFileSystem){
        myFileSystem = aFileSystem;
        myFileSystem.subscribe(this);
    }

    public void update() {
        fileInfo = "Files:";
        for (MyFileComponent file: myFileSystem.getRoot().getChildren()) {
            fileInfo += " " + file.getName();
        }

    }

    public String listFiles() {
        return fileInfo;
    }
}
