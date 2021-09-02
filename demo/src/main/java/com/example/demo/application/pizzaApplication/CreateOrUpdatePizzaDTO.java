package com.example.demo.application.pizzaApplication;

import java.util.Set;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import org.springframework.validation.annotation.Validated;

import lombok.Getter;
import lombok.Setter;

@Validated
public @Getter @Setter class CreateOrUpdatePizzaDTO {

    @NotBlank
    public String name;

    @NotEmpty
    public Set<UUID> Ingredients;
}
