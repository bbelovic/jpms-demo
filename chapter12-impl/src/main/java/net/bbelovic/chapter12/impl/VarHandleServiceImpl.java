package net.bbelovic.chapter12.impl;

import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

public class VarHandleServiceImpl {
    public void execute(MethodHandles.Lookup lookup, Object o) {
        Class<?> cls = o.getClass();
        try {
            var field = cls.getDeclaredField("id");
            VarHandle varHandle = lookup.unreflectVarHandle(field);
            varHandle.get(o);
            varHandle.getAndSet(o, 100L);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
