package com.sebastian_daschner.coffee_shop.it;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CreateOrderSmokeIT {

    private CoffeeOrderSystem coffeeOrderSystem;

    @BeforeEach
    void setUp() {
        coffeeOrderSystem = new CoffeeOrderSystem();
    }

    @Test
    void testIsSystemUp() {
        assertThat(coffeeOrderSystem.isSystemUp()).isTrue();
    }

    @Test
    void testGetTypes() {
        assertThat(coffeeOrderSystem.getTypes()).containsExactlyInAnyOrder("Espresso", "Pour_over", "Latte");
    }

    @Test
    void testGetTypeOrigins() {
        assertThat(coffeeOrderSystem.getOrigins("Espresso")).containsExactlyInAnyOrder("Colombia", "Ethiopia");
    }

    @AfterEach
    void tearDown() {
        coffeeOrderSystem.close();
    }

}