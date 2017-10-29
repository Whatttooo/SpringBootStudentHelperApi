package com.whateley.FrontEndTech;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class FrontEndTech {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long frontEndTechId;
    private String name;
    private String description;

    public FrontEndTech(Long frontEndTechId, String name, String description) {
        this.frontEndTechId = frontEndTechId;
        this.name = name;
        this.description = description;
    }

    public Long getFrontEndTechId() {
        return frontEndTechId;
    }

    public void setFrontEndTechId(Long frontEndTechId) {
        this.frontEndTechId = frontEndTechId;
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
