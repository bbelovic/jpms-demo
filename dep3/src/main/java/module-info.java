import net.bbelovic.dependency.three.AnotherSimpleService;
import net.bbelovic.services.SimpleService;

module cipher.dep.three {
    requires cipher.services.main;
    provides SimpleService with AnotherSimpleService;
}