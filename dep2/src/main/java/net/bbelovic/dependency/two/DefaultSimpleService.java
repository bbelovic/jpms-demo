package net.bbelovic.dependency.two;

import net.bbelovic.services.SimpleService;

public class DefaultSimpleService implements SimpleService {
    @Override
    public void execute() {
        System.out.println("executing: 'DefaultSimpleService' ");
    }
}
