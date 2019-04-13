package net.bbelovic.ch11.depending.transitive;

import net.bbelovic.ch11.exposed.types.ServiceStatus;
import net.bbelovic.chapter11.optional.DefaultOptionalHelperService;

public class Main {
    public static void main(String[] args) {
        DefaultStatusService statusService = new DefaultStatusService(new DefaultOptionalHelperService());
        System.out.println("Service status: " + statusService.getStatus());
        statusService.setStatus(ServiceStatus.RUNNING);
        statusService.callOptionalDependency();
    }
}
