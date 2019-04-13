package net.bbelovic.another.types;

import net.bbelovic.ch11.exposed.types.ServiceStatus;

public interface MutableStatusService {
    void setStatus(ServiceStatus serviceStatus);
}
