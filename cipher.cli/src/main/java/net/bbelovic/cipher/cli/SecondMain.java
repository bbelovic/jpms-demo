package net.bbelovic.cipher.cli;

public class SecondMain {
    public static void main(String[] args) throws Exception {
        var exported = Class.forName("net.bbelovic.cipher.cli.standalone.ExportedClass");
        var exportedResource = exported.getResource("file.txt");
        System.out.println("exportedResource: " + exportedResource);
        final var opened = Class.forName("net.bbelovic.cipher.cli.standalone.open.OpenClass");
        var openedResource = opened.getResource("file.txt");
        System.out.println("openedResource: " + openedResource);

        var closed = Class.forName("net.bbelovic.cipher.cli.standalone.closed.ClosedClass");
        var closedManifest = closed.getResource("/META-INF/MANIFEST.MF");
        System.out.println("closedManifest = " + closedManifest);
        final var closedBytecode = closed.getResource("/net/bbelovic/cipher/cli/standalone/closed/ClosedClass.class");
        System.out.println("closedBytecode = " +closedBytecode);
        var closedResource = closed.getResource("file.txt");
        System.out.println("closedResource = " +closedResource);
    }
}
