package win.blinkdr.dubbo.service.impl;

import org.apache.dubbo.config.annotation.Service;
import win.blinkdr.dubbo.service.AnnotationService;

@Service
public class AnnotationServiceImpl implements AnnotationService {
    @Override
    public String sayHello(String name) {
        return "annotation: hello, " + name;
    }
}
