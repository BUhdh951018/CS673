package edu.bu.metcs.MyFileSystem;

public class MyFileSysDetailView implements Observer {
    MyFileSystem myFileSystem;
    String detailedInfo = "";

    public MyFileSysDetailView(MyFileSystem aFileSystem){
        myFileSystem = aFileSystem;
        myFileSystem.subscribe(this);
    }

    public void update() {
        detailedInfo  = "Files:";
        for (MyFileComponent file: myFileSystem.getRoot().getChildren()) {
            detailedInfo += "\n" + file.getName();
        }
    }

    public String showFileDetail() {
        return detailedInfo;
    }
}
