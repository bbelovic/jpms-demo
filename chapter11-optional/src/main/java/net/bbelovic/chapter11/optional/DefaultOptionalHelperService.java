package net.bbelovic.chapter11.optional;

public class DefaultOptionalHelperService implements OptionalHelperService {
    @Override
    public void help() {
        System.out.println("Optional dependency loaded.");
    }
}
