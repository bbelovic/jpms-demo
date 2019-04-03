import net.bbelovic.dependency.two.DefaultSimpleService;
import net.bbelovic.services.SimpleService;

module cipher.dep {
    exports net.bbelovic.dependency.two;
    requires cipher.services.main;
    provides SimpleService with DefaultSimpleService;
}