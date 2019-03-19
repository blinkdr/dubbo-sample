package win.blinkdr.dubbo.action;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Component;
import win.blinkdr.dubbo.service.AnnotationService;

@Component
public class AnnotationAction {
    @Reference
    private AnnotationService annotationService;

    public String doSayHello(String name){
        return annotationService.sayHello(name);
    }
}
