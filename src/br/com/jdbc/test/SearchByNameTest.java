package br.com.jdbc.test;

import java.util.List;

import br.com.jdbc.dao.ContactDao;
import br.com.jdbc.model.Contact;

public class SearchByNameTest {

	public static void main(String[] args) {
		ContactDao dao = new ContactDao();
		List<Contact> contacts = dao.searchByName("EMILLY");
		
		for (Contact contact : contacts) {
			contact.printOut();
		}
	}

}
