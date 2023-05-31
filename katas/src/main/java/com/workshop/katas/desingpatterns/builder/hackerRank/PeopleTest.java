package com.workshop.katas.desingpatterns.builder.hackerRank;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.JUnit4;
import java.security.SecureRandom;
import java.math.BigInteger;
import java.lang.reflect.*;

public class PeopleTest {

  @Test
  public void testSample() {
    People person = People.builder()
        .name("Adam")
        .lastName("Savage")
        .age(25)
        .city("San Francisco")
        .job("Unchained Reaction")
        .build();

    assertEquals(
        "Savage",
        person.getLastName()
    );
    assertEquals(
        "Adam",
        person.getName()
    );
    assertEquals(
        25,
        person.getAge()
    );
    assertEquals(
        "Unchained Reaction",
        person.getJob()
    );
    assertEquals(
        "San Francisco",
        person.getCity()
    );
    assertEquals(
        "hello my name is Adam",
        person.greet()
    );
  }

  @Test
  public void fieldVisibilityTest() {
    People person = People.builder()
        .city("New York")
        .lastName("Adame")
        .job("Clerck")
        .name("Dante")
        .age(33)
        .build();

    assertEquals(
        "Adame",
        person.getLastName()
    );
    assertEquals(
        "Dante",
        person.getName()
    );
    assertEquals(
        33,
        person.getAge()
    );
    assertEquals(
        "Clerck",
        person.getJob()
    );
    assertEquals(
        "New York",
        person.getCity()
    );
    assertEquals(
        "hello my name is Dante",
        person.greet()
    );

    try {
      testField("age",person);
      testField("name",person);
      testField("lastName",person);
      testField("city",person);
      testField("job",person);
      testField("GREET",person);
    } catch (NoSuchFieldException x) {
      x.printStackTrace();
      fail();
    }
  }


  public void testField(String name, People ed) throws NoSuchFieldException{
    Field aField = ed.getClass().getDeclaredField(name);
    assertTrue(name+" is not private",Modifier.isPrivate(aField.getModifiers()));
  }

}