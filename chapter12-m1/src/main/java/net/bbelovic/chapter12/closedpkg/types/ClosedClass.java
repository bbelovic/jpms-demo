package net.bbelovic.chapter12.closedpkg.types;

public class ClosedClass {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("ClosedClass{id=%d}", id);
    }
}
