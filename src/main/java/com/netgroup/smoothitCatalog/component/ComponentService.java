package com.netgroup.smoothitCatalog.component;

import org.springframework.stereotype.Service;

@Service
public class ComponentService {

    public final ComponentRepository componentRepository;

    public ComponentService(ComponentRepository componentRepository) {
        this.componentRepository = componentRepository;
    }

    public Iterable<Component> getComponents() {
        return componentRepository.findAll();
    }

}
