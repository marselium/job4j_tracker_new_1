package ru.job4j.search;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class PhoneDictionaryTest {
    @Test
    public void whenFindByName() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
    }

    @Test
    public void whenFindTwoPersons() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Dima", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Dima", "Petrov", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Petr");
        assertThat(persons.get(0).getSurname()).isEqualTo("Arsentev");
        assertThat(persons.get(1).getSurname()).isEqualTo("Petrov");
    }

    @Test
    public void whenNotFindAnyPerson() {
        PhoneDictionary phones = new PhoneDictionary();
        phones.add(
                new Person("Petr", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Dima", "Arsentev", "534872", "Bryansk")
        );
        phones.add(
                new Person("Dima", "Petrov", "534872", "Bryansk")
        );
        ArrayList<Person> persons = phones.find("Andrew");
        assertThat(persons).isEmpty();
    }
}
