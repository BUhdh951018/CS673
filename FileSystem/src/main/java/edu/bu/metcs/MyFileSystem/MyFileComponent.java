package edu.bu.metcs.MyFileSystem;

public abstract class MyFileComponent {
    private String name;
    private String owner;
    private int size;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public abstract void changeOwner(String newOwner);

    public abstract void addChild(MyFileComponent a);

    public abstract void delChild(MyFileComponent a);
}
