package com.example.demotemplatejsp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@SpringBootApplication
@Controller
public class DemoTemplateJspApplication implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;

    public static void main(String[] args) {
        SpringApplication.run(DemoTemplateJspApplication.class, args);
    }

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("name", "hello jsp");
        return "index";
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Person person = new Person();
        person.setName("tonyspark");
        person.setPhone("010-1234-1234");
        person.setAddr("seoul");
        person.setUserId("tony");
        person.setUserPassword("1234");
        personRepository.save(person);

        List<Person> list = personRepository.list();
        list.stream().forEach(r -> System.out.println(r.getName()));
    }
}
