package ru.job4j.pojo;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ShopTest {

    @Test
    void whenLastNull() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int exp = 3;
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenFirstNull() {
        Product[] products = new Product[5];
        products[3] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int exp = 0;
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    void whenHasNotNull() {
        Product[] products = new Product[3];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        int exp = -1;
        int rsl = Shop.indexOfNull(products);
        assertThat(rsl).isEqualTo(exp);
    }
}