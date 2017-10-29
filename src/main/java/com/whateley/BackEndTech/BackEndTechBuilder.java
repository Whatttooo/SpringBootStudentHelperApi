package com.whateley.BackEndTech;

public final class BackEndTechBuilder {
    private Long backEndTechId;
    private String name;
    private String description;

    private BackEndTechBuilder() {
    }

    public static BackEndTechBuilder aBackEndTech() {
        return new BackEndTechBuilder();
    }

    public BackEndTechBuilder withBackEndTechId(Long backEndTechId) {
        this.backEndTechId = backEndTechId;
        return this;
    }

    public BackEndTechBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public BackEndTechBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public BackEndTech build() {
        return new BackEndTech(backEndTechId, name, description);
    }
}
