package net.bbelovic.chapter12.reflection.reader.main;

import net.bbelovic.chapter12.exportedpkg.types.ExportedClass;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) {
        exportsDoesNotSupportDeepReflection();
    }

    private static void opensSupportsDeepReflection() {
        try {
            var openedCls = Class.forName("net.bbelovic.chapter12.openedpkg.types.OpenedClass");
            var instance = openedCls.getConstructor().newInstance();
            System.out.println("instance of OpenedClass created: "+ instance);

            Field id = instance.getClass().getDeclaredField("id");
            id.setAccessible(true);
            id.set();


        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private static void exportsDoesNotSupportDeepReflection() {
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
