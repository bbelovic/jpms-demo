package net.bbelovic.cipher.cli;

import net.bbelovic.cipher.MorseCode;
import net.bbelovic.dependency.one.*;

import java.lang.reflect.Constructor;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello modules");
        System.out.println("Instantiating morse code");
        Constructor<?> constructor = Class.forName("net.bbelovic.cipher.MorseCode")
                .getDeclaredConstructor();
        constructor.setAccessible(true);
        Object instance = constructor.newInstance();
        MorseCode morseCode = new MorseCode();
        System.out.println("Morse code instantiated");
        HelperDependencyOne one = new HelperDependencyOne();
    }
}
