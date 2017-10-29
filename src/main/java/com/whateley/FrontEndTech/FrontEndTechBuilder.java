package com.whateley.FrontEndTech;

public final class FrontEndTechBuilder {
    private Long frontEndTechId;
    private String name;
    private String description;

    private FrontEndTechBuilder() {
    }

    public static FrontEndTechBuilder aFrontEndTech() {
        return new FrontEndTechBuilder();
    }

    public FrontEndTechBuilder withFrontEndTechId(Long frontEndTechId) {
        this.frontEndTechId = frontEndTechId;
        return this;
    }

    public FrontEndTechBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public FrontEndTechBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public FrontEndTech build() {
        return new FrontEndTech(frontEndTechId, name, description);
    }
}
