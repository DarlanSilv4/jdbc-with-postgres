package br.com.jdbc.test;

import java.util.Calendar;

import br.com.jdbc.dao.ContactDao;
import br.com.jdbc.model.Contact;

public class TestInsert {

	public static void main(String[] args) {
		Contact contact = new Contact();
		contact.setName("Emilly");
		contact.setEmail("emilly@email.com");
		contact.setAddress("R. Vergueiro 3185 cj57");
		contact.setBirthday(Calendar.getInstance());
		
		ContactDao dao = new ContactDao();
		dao.add(contact);
		
		System.out.println("Gravado!");
	}

}
