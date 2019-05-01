package net.bbelovic.chapter12.impl;

import java.lang.invoke.MethodHandles;

public class VarHandleServiceImpl {
    private final MethodHandles.Lookup lookup;

    public VarHandleServiceImpl(MethodHandles.Lookup lookup) {
        this.lookup = lookup;
    }

    public void execute(Object o) {
        Class<?> cls = o.getClass();
        try {
            var field = cls.getDeclaredField("id");
            var varHandle = MethodHandles.privateLookupIn(cls, lookup)
            .unreflectVarHandle(field);
            var value = varHandle.get(o);
            System.out.println("Original value = " + value);
            varHandle.set(o, 100);
            System.out.println("Object after modification = " + o);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
