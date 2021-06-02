package com.capgemini.authorapp.service;

import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.capgemini.authorapp.model.Author;

public class AuthorManager {
	
	Map<String,Author> authorList=new ConcurrentHashMap<String,Author>();
	
	public void addAuthor(String authName,String authEmail,char authGender){
		Author author=new Author(authName,authEmail,authGender);
		validateAuthor(author);
		authorList.put(generateKey(author), author);
	}

	public String generateKey(Author author) {
		// TODO Auto-generated method stub
		return String.format("%s",author.getName());
	}

	public void validateAuthor(Author author) {
		// TODO Auto-generated method stub
		author.validateName();
		author.validateEmail();
		author.validateGender();
	}
	
	public Collection<Author> getAllAuthors(){
		return authorList.values();
	}

}
