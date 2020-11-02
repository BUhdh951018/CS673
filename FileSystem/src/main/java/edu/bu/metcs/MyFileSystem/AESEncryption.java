package edu.bu.metcs.MyFileSystem;

public class AESEncryption implements Encryption{
    public String encrypt(String content) {
        return "AES" + content;
    }
}
