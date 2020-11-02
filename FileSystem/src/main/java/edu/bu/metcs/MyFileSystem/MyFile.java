package edu.bu.metcs.MyFileSystem;

public class MyFile extends MyFileComponent {

    private String content;
    private Encryption encryptAlgo = null;

    public MyFile(String name, int size) {
        setSize(size);
        setName(name);
        setOwner("root");
        setContent("");
    }

    public Encryption getEncryptAlgo() {
        return encryptAlgo;
    }

    public void setEncryptAlgo(Encryption encryptAlgo) {
        this.encryptAlgo = encryptAlgo;
    }

    public void encrypt(){
        if (encryptAlgo != null)
            content = encryptAlgo.encrypt(content);
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void changeOwner(String newOwner) {
        setOwner(newOwner);
    }

    public void addChild(MyFileComponent aFileComponent) {

    }

    public void delChild(MyFileComponent aFileComponent) {

    }

}
