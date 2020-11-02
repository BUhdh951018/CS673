package edu.bu.metcs.MyFileSystem;

import java.util.ArrayList;
import java.util.List;

public class MyFolder extends MyFileComponent{
    private List<MyFileComponent> myChildren = new ArrayList<>();

    public MyFolder(String name){
        setName(name);
        setOwner("root");
        setSize(0);
    }

    public void changeOwner(String newOwner) {
        setOwner(newOwner);
        for (MyFileComponent myChild: myChildren)
            myChild.setOwner(newOwner);
    }

    public List<MyFileComponent> getChildren() {return myChildren;}

    public void addChild(MyFileComponent aFileComponent) {
        myChildren.add(aFileComponent);
    }

    public void delChild(MyFileComponent aFileComponent) {
        myChildren.remove(aFileComponent);
    }
}
