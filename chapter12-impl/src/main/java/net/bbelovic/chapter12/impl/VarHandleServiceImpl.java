package net.bbelovic.chapter12.impl;

import java.lang.invoke.MethodHandles;
import java.lang.reflect.Field;

public class VarHandleServiceImpl {
    public void execute(MethodHandles.Lookup lookup, Object o) {
        Class<?> cls = o.getClass();
        Field field = cls.getDeclaredField("id");
        lookup.
    }
}
