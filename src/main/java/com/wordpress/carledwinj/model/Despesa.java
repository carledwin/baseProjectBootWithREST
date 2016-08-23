package com.wordpress.carledwinj.model;

import javax.persistence.Entity;

/**
 * Created by carledwinj on 23/08/2016.
 */
@Entity
public class Despesa extends AbstractModel<Long> {

    private String name;
    private String description;

    public Despesa(){
    }

    public Despesa(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
