package net.bbelovic.chapter12.openedpkg.types;

public class OpenedClass {
    private final Object deepField = new Object();

    public void execute() {
        System.out.println("hello from opened class!");
    }
}
