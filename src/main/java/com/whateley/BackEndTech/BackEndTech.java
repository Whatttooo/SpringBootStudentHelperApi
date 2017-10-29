package com.whateley.BackEndTech;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BackEndTech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long backEndTechId;
    private String name;
    private String description;

    public BackEndTech(Long backEndTechId, String name, String description) {
        this.backEndTechId = backEndTechId;
        this.name = name;
        this.description = description;
    }

    public Long getBackEndTechId() {
        return backEndTechId;
    }

    public void setBackEndTechId(Long backEndTechId) {
        this.backEndTechId = backEndTechId;
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
