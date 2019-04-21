package net.bbelovic.chapter12.reflection.reader.main;

import net.bbelovic.chapter12.exportedpkg.types.ExportedClass;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        try {
            var constructor = ExportedClass.class.getConstructor();
            var instance = constructor.newInstance();
            System.out.println("after creation id = "+ instance.getId());

            var field = instance.getClass().getDeclaredField("id");
            field.setAccessible(true);
            field.set(instance, 42);
            System.out.println("after modification id = "+ instance.getId());
        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
