package net.bbelovic.ch11.depending.transitive;

import net.bbelovic.ch11.exposed.types.ServiceStatus;
import net.bbelovic.ch11.exposing.types.StatusService;

public class DefaultStatusService implements StatusService {
    @Override
    public ServiceStatus getStatus() {
        return ServiceStatus.UNKNOWN;
    }
}
