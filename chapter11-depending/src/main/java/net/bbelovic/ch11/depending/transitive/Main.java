package net.bbelovic.ch11.depending.transitive;

import net.bbelovic.ch11.exposing.types.StatusService;

public class Main {
    public static void main(String[] args) {
        StatusService statusService = new DefaultStatusService();
        System.out.println("Service status: " + statusService.getStatus());
    }
}
