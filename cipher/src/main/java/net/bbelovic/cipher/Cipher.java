package net.bbelovic.cipher;

import net.bbelovic.cipher.impl.CaesarCipher;

public interface Cipher {
    String encrypt(String input);
    String decrypt(String input);

    static Cipher caesarCipher() {
        return new CaesarCipher();
    }
}
