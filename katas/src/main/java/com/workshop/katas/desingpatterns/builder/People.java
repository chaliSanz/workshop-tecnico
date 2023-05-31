package com.workshop.katas.desingpatterns.builder;

public class People {

  private static final String GREET = "hello";

  private int age;

  private String name;

  private String lastName;

  private String job;

  private String city;

  private String highschool;

  private People() {
  }

  public String greet() {
    return GREET + " my name is " + name;
  }

  public static class Builder {

    private People people;

    public Builder(String name) {
      people = new People();
      people.name = name;
    }

    public Builder lastName(String lastName) {
      people.lastName = lastName;
      return this;
    }

    public Builder city(String city) {
      people.city = city;
      return this;
    }

    public BuilderOldPerson old(int age) {
      if (age < 18) throw new IllegalArgumentException("the person is young " + age);
      people.age = age;
      return new BuilderOldPerson(people);
    }

    public BuilderYoungPerson young(int age) {
      if (age >= 18) throw new IllegalArgumentException("the person is old " + age);
      people.age = age;
      return new BuilderYoungPerson(people);
    }

    public People build() {
      return people;
    }

  }


  public static class BuilderOldPerson {

    private People people;

    private BuilderOldPerson(People person){
      people = person;
    }

    public BuilderOldPerson job(String job){
      people.job = job;
      return  this;
    }

    public People build() {
      return people;
    }

  }

  public static class BuilderYoungPerson {

    private People people;

    private BuilderYoungPerson(People person){
      people = person;
    }

    public BuilderYoungPerson highSchool(String highschool){
      people.highschool = highschool;
      return  this;
    }
    public People build() {
      return people;
    }
  }

}

