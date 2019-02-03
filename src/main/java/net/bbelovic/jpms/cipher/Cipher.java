package net.bbelovic.jpms.cipher;

public interface Cipher {
    String encrypt(String input);
    String decrypt(String input);
}
