package net.bbelovic.chapter12.exportedpkg.types;

public class ExportedClass {
    private int id = 10;
    public void execute() {
        System.out.println("hello from exported class!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
