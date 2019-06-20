package com.netgroup.smoothitCatalog.smoothie;

import com.netgroup.smoothitCatalog.component.Component;

import javax.persistence.*;

@Entity
public class SmoothieComponent {

    @Id
    @GeneratedValue
    public Long id;

    public Long amount;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(referencedColumnName = "id", name = "component_id")
    public Component component;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }
}
