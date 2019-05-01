package net.bbelovic.chapter12.impl;

import java.lang.invoke.MethodHandles;

public class VarHandleServiceImpl {
    public void execute(MethodHandles.Lookup lookup, Object o) {
        Class<?> cls = o.getClass();
        try {
            var field = cls.getDeclaredField("id");
            var varHandle = MethodHandles.privateLookupIn(cls, lookup)
            .unreflectVarHandle(field);
            var value = varHandle.get(o);
            System.out.println("Original value = " + value);
            varHandle.set(o, 100L);
            System.out.println("Object after modification = " + o);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
