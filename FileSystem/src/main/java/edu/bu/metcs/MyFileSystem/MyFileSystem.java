package edu.bu.metcs.MyFileSystem;

public class MyFileSystem extends Subject {
    public static final int HIGH_SECURITY = 2;
    public static final int LOW_SECURITY = 1;
    public static final int NO_SECURITY = 0;

    public static final AESEncryption AESALGO = new AESEncryption();
    public static final TWOFISHEncryption TWOALGO = new TWOFISHEncryption();

    MyFolder root = new MyFolder("");

    public void add(MyFolder parent, MyFileComponent myFileComponent) {
        parent.addChild(myFileComponent);
        notifyObservers();
    }

    public void changeFileName(MyFile aFile, String newName){
        aFile.setName(newName);
        notifyObservers();
    }

    public void changeOwner(MyFile aFile, String newOwner) {
        aFile.changeOwner(newOwner);
        notifyObservers();
    }

    public void setSecurityLevel(MyFile file, int level) {
        if (level == MyFileSystem.HIGH_SECURITY) {
            file.setEncryptAlgo(AESALGO);
        } else if (level == MyFileSystem.LOW_SECURITY) {
            file.setEncryptAlgo(TWOALGO);
        }
    }

    public MyFolder getRoot() {
        return root;
    }

}
