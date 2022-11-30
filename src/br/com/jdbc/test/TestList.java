package br.com.jdbc.test;

import java.util.List;

import br.com.jdbc.dao.ContactDao;
import br.com.jdbc.model.Contact;

public class TestList {

	public static void main(String[] args) {
		ContactDao dao = new ContactDao();
		List<Contact> contacts = dao.getList();
		
		for (Contact contact : contacts) {
			System.out.println("Name: "+ contact.getName());
			System.out.println("Email: "+ contact.getEmail());
			System.out.println("Address: "+ contact.getAddress());
			System.out.println("Birthday: "+ contact.getBirthday().getTime() + "\n");
		}
	}

}
