package com.netgroup.smoothitCatalog.smoothie;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Smoothie {

    @Id
    @GeneratedValue
    public Long id;

    public String name;

    public Long price;

    public Long calories;

    public String instructions;

    public String description;

    @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL)
    @JoinColumn(referencedColumnName = "id", name = "smoothie_id")
    public Set<SmoothieComponent> smoothieComponents;

    public Long getVolume() {
        if (smoothieComponents != null) {
            return smoothieComponents.stream()
                    .map(smoothieComponent -> smoothieComponent.getAmount() * smoothieComponent.getComponent().getVolume())
                    .mapToLong(value -> value).sum();
        }
        return null;
    }
}
