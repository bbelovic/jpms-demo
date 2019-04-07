package net.bbelovic.dependency.three;

import net.bbelovic.services.SimpleService;
import net.bbelovic.services.annotation.Alpha;

@Alpha
public class AnotherSimpleService implements SimpleService {
    @Override
    public void execute() {
        System.out.println("executing: " + getClass().getSimpleName() );
    }
}
