package com.netgroup.smoothitCatalog.component;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "component")
public class ComponentController {

    public final ComponentService componentService;

    public ComponentController(ComponentService componentService) {
        this.componentService = componentService;
    }

    @GetMapping
    public Iterable<Component> getComponents() {
        return componentService.getComponents();
    }

}
