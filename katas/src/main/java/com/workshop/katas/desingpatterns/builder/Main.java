package com.workshop.katas.desingpatterns.builder;

public class Main {

	public static void main(String[] args) {

	People person = new People.Builder("chali")
			.city("sinaloa")
			.lastName("sanz")
			.old(28)
			.job("control c, control v")
			.build();

	System.out.println(person.greet());

		People person2 = new People.Builder("juan")
				.city("cd")
				.lastName("perez")
				.young(13)
				.highSchool("calle")
				.build();

		System.out.println(person2.greet());




	}

}