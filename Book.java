package com.in28minutes.springboot.basics.springbootin10steps;

public class Book {
	long id;
	String name;
	String author;
	String lastname;
<<<<<<< HEAD
	STring testname;
        String date;
	String mgrname;

=======
	String testname;
	String testagain;
	
>>>>>>> cbae441cfd3aa3e9c7fc17224d4c83685e950607

	public Book(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	public long getId() {
		return id;
	}
	

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	@Override
	public String toString() {
		return String.format("Book [id=%s, name=%s, author=%s]", id, name, author);
	}

}
