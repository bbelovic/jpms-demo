package net.bbelovic.cipher.impl;

import net.bbelovic.cipher.Cipher;

import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

final class CaesarCipher implements Cipher {
    @Override
    public String encrypt(String input) {
        IntUnaryOperator encryptionFunction = (int c) -> ((c - 65 + 3) % 26) + 65;
        return input.chars()
                .map(encryptionFunction)
                .mapToObj(Integer::toString)
                .collect(Collectors.joining());
    }

    @Override
    public String decrypt(String input) {
        return null;
    }
}
