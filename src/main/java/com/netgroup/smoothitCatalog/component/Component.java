package com.netgroup.smoothitCatalog.component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Component {

    @Id
    @GeneratedValue
    public Long id;

    public String name;

    public Long volume;

    public String colorHex;

    public String brand;

    public String unit;

    public Long kcalPerUnit;

    public Long unitPriceEur;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getVolume() {
        return volume;
    }

    public void setVolume(Long volume) {
        this.volume = volume;
    }

    public String getColorHex() {
        return colorHex;
    }

    public void setColorHex(String colorHex) {
        this.colorHex = colorHex;
    }
}
