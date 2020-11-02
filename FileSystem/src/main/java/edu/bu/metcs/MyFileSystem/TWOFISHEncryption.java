package edu.bu.metcs.MyFileSystem;

public class TWOFISHEncryption implements Encryption{
    public String encrypt(String content) {
        return "Twofish" + content;
    }
}
