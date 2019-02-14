package net.bbelovic.cipher.cli.standalone;

import net.bbelovic.cipher.cli.standalone.closed.ClosedClass;
import net.bbelovic.cipher.cli.standalone.open.OpenClass;

public class ExportedClass {
    private final OpenClass openClass = new OpenClass();
    private final ClosedClass closedClass = new ClosedClass();
}
