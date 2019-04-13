package net.bbelovic.ch11.depending.transitive;

import net.bbelovic.ch11.exposed.types.ServiceStatus;

public class Main {
    public static void main(String[] args) {
        DefaultStatusService statusService = new DefaultStatusService();
        System.out.println("Service status: " + statusService.getStatus());
        statusService.setStatus(ServiceStatus.RUNNING);
    }
}
