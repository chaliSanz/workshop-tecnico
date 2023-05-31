package com.workshop.katas.desingpatterns.builder.hackerRank;

public class People {

  private static final String GREET = "hello";

  private int age;

  private String name;

  private String lastName;

  private String job;

  private String city;

  public int getAge() {
    return age;
  }

  public String getLastName() {
    return lastName;
  }

  public String getJob() {
    return job;
  }

  public String getCity() {
    return city;
  }

  public String getName() {
    return name;
  }

  private People() {
  }

  public static Builder builder(){
    return new Builder();
  }

  public String greet() {
    return GREET + " my name is " + name;
  }

  public static class Builder {

    private People people;

    public Builder() {
      people = new People();
    }

    public Builder name(String name){
      people.name = name;
      return this;
    }
    public Builder lastName(String lastName) {
      people.lastName = lastName;
      return this;
    }

    public Builder age(int age) {
      people.age = age;
      return this;
    }

    public Builder city(String city) {
      people.city = city;
      return this;
    }

    public Builder job(String job) {
      people.job = job;
      return this;
    }

    public People build() {
      return people;
    }

  }


}
