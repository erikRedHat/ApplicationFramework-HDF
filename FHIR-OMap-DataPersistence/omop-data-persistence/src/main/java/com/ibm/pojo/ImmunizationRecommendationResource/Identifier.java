package com.ibm.pojo.ImmunizationRecommendationResource;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class Identifier {
    public String system;
    public String value;

    public String getValue() { return value; }

    public void setValue(String value) { this.value = value; }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}