package net.bbelovic.chapter12.exportedpkg.types;

public class ExportedClass {
    private final Object deepField = new Object();
    public void execute() {
        System.out.println("hello from exported class!");
    }
}
