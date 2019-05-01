package net.bbelovic.chapter12.exportedpkg.types;

import java.lang.invoke.MethodHandles;

public final class LookupProvider {
    public static MethodHandles.Lookup getLookup() {
        return MethodHandles.lookup();
    }
}
