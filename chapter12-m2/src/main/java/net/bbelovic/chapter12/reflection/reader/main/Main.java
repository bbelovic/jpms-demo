package net.bbelovic.chapter12.reflection.reader.main;

import net.bbelovic.chapter12.exportedpkg.types.ExportedClass;
import net.bbelovic.chapter12.exportedpkg.types.LookupProvider;
import net.bbelovic.chapter12.impl.VarHandleServiceImpl;

import java.lang.invoke.MethodHandles;
import java.lang.module.ModuleDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        var opCode = args[0];
        switch (opCode) {
            case "opens": opensSupportsDeepReflection(); break;
            case "varhandle": varHandlesSupportDeepReflection(); break;
            case "exports": exportsDoesNotSupportDeepReflection(); break;
            case "exception" : dumpModuleVersionInStackTrace(); break;
            case "rawversion": printModuleVersion(); break;
            default: throw new IllegalArgumentException("Unsupported opcode: " + opCode);
        }
    }

    private static void opensSupportsDeepReflection() {
        try {
            var openedCls = Class.forName("net.bbelovic.chapter12.openedpkg.types.OpenedClass");
            var instance = openedCls.getConstructor().newInstance();
            System.out.println("instance of OpenedClass created: "+ instance);

            Field id = instance.getClass().getDeclaredField("id");
            id.setAccessible(true);
            id.set(instance, 7);
            System.out.println("instance of OpenedClass after modification: "+ instance);


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

    private static void varHandlesSupportDeepReflection() {
        var exportedClass = new ExportedClass();
        MethodHandles.Lookup lookup = LookupProvider.getLookup();
        VarHandleServiceImpl service = new VarHandleServiceImpl(lookup);
        service.execute(exportedClass);
    }

    private static void dumpModuleVersionInStackTrace() {
        throw new RuntimeException();
    }

    private static void printModuleVersion() {
        var moduleDescriptor = Main.class.getModule().getDescriptor();
        var rawVersionOptional = moduleDescriptor.rawVersion();
        rawVersionOptional.ifPresentOrElse(rawVersion -> System.out.println("Raw version: "+ rawVersion),
                () -> System.err.println("no raw version"));
    }
}
