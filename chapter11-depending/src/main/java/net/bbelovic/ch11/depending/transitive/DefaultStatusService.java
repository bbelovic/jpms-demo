package net.bbelovic.ch11.depending.transitive;

import net.bbelovic.another.types.MutableStatusService;
import net.bbelovic.ch11.exposed.types.ServiceStatus;
import net.bbelovic.ch11.exposing.types.StatusService;
import net.bbelovic.chapter11.optional.OptionalHelperService;

public class DefaultStatusService implements StatusService, MutableStatusService {

    private final OptionalHelperService helperService;

    public DefaultStatusService(OptionalHelperService helperService) {
        this.helperService = helperService;
    }

    @Override
    public ServiceStatus getStatus() {
        return ServiceStatus.UNKNOWN;
    }

    @Override
    public void setStatus(ServiceStatus serviceStatus) {
        System.out.println("setting status to: " + serviceStatus);
    }

    public void callOptionalDependency() {
        helperService.help();
    }
}
