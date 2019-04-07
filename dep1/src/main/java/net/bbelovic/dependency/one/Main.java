package net.bbelovic.dependency.one;

import net.bbelovic.services.SimpleService;
import net.bbelovic.services.annotation.Alpha;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<SimpleService> services = ServiceLoader.load(SimpleService.class)
                .stream()
                .filter(provider -> provider.type().isAnnotationPresent(Alpha.class))
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
        System.out.println("Found services: "+ services.size());
        services.forEach(SimpleService::execute);
    }
}
