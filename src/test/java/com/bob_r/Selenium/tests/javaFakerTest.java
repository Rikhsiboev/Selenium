package com.bob_r.Selenium.tests;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class javaFakerTest {
    Faker faker = new Faker();

    @Test
    public void test(){
        System.out.println("faker.name().username() = " + faker.name().username());
        System.out.println("faker.name().prefix() = " + faker.name().prefix());
        System.out.println("faker.app().version() = " + faker.app().version());
        System.out.println("faker.artist().name() = " + faker.artist().name());
    }
}
