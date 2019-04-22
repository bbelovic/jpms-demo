package net.bbelovic.chapter12.openedpkg.types;

public class OpenedClass {
    private int id = 12;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void execute() {
        System.out.println("hello from opened class!");
    }

    @Override
    public String toString() {
        return String.format("OpenedClass{id=%d}", id);
    }
}
