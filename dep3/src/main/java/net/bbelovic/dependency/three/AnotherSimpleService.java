package net.bbelovic.dependency.three;

import net.bbelovic.services.SimpleService;

public class AnotherSimpleService implements SimpleService {
    @Override
    public void execute() {
        System.out.println("executing: " + getClass().getSimpleName() );
    }
}
