package net.bbelovic.cipher.cli.standalone;

public class SomeOtherMain {
    public static void main(String[] args) throws Exception {
        System.out.println("Loading resources within module");
        Class<?> closed = Class.forName("net.bbelovic.cipher.cli.standalone.closed.ClosedClass");
        var closedFile = closed.getResource("file.txt");
        System.out.println("closedFile= " +closedFile);

        var open = Class.forName("net.bbelovic.cipher.cli.standalone.open.OpenClass");
        var openFile = open.getResource("file.txt");
        System.out.println("openFile= " +openFile);

        var exported = Class.forName("net.bbelovic.cipher.cli.standalone.ExportedClass");
        var exportedFile = exported.getResource("file.txt");
        System.out.println("exportedFile= " + exportedFile);
    }
}
