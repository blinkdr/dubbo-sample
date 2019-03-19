package win.blinkdr.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import win.blinkdr.dubbo.action.AnnotationAction;

@RestController
public class HelloController {

    @Autowired
    AnnotationAction annotationAction;

    @RequestMapping(value = "/sayhello/{name}")
    public String sayHello(@PathVariable(value = "name") String name){
        return annotationAction.doSayHello(name);
    }
}
