package net.bbelovic.dependency.one;

import net.bbelovic.services.SimpleService;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<SimpleService> services = ServiceLoader.load(SimpleService.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
        System.out.println(services.size());
    }
}
