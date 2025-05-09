package ru.job4j.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class BatteryTest {

    @Test
    void whenThis30Another50ThenAnotherLoadEqual80() {
        Battery charger = new Battery(30);
        Battery another = new Battery(50);
        charger.exchange(another);
        int exp = 80;
        assertThat(another.about()).isEqualTo("My charge is : " + exp + "%");
    }

    @Test
    void whenThis100Another0ThenAnotherLoadEqual100() {
        Battery charger = new Battery(100);
        Battery another = new Battery(0);
        int exp = 100;
        charger.exchange(another);
        assertThat(another.about()).isEqualTo("My charge is : " + exp + "%");
    }
}