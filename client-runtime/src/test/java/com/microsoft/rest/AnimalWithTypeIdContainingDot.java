package com.microsoft.rest;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata\\.type")
@JsonTypeName("AnimalWithTypeIdContainingDot")
@JsonSubTypes({
        @JsonSubTypes.Type(name = "#Favourite.Pet.DogWithTypeIdContainingDot", value = DogWithTypeIdContainingDot.class),
        @JsonSubTypes.Type(name = "#Favourite.Pet.CatWithTypeIdContainingDot", value = CatWithTypeIdContainingDot.class),
        @JsonSubTypes.Type(name = "#Favourite.Pet.RabbitWithTypeIdContainingDot", value = RabbitWithTypeIdContainingDot.class)
})
public class AnimalWithTypeIdContainingDot {
}

