package net.bbelovic.cipher.cli;

import net.bbelovic.cipher.cli.standalone.ExportedClass;
import net.bbelovic.cipher.cli.standalone.SomeOtherMain;

public class OtherMain {
    public static void main(String[] args) {
        System.out.println("other main");
        System.out.println("module args:");
        for (String each: args) {
            System.out.println(each);
        }
        ExportedClass ex = new ExportedClass();
        SomeOtherMain someOtherMain = new SomeOtherMain();
    }
}
