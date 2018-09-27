package com.example.demotemplatejsp;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonRepository {

    List<Person> list;

    PersonRepository() {
        list = new ArrayList<>();
    }

    public void save(Person person) {
        list.add(person);
    }

    public List<Person> list() {
        return list;
    }

    public Person detail(String id) {
        for(Person person : list) {
            if (person.getUserId().equals(id)) {
                return person;
            }
        }
        return new Person();
    }
}
