package br.com.jdbc.test;

import br.com.jdbc.dao.ContactDao;
import br.com.jdbc.model.Contact;

public class UpdateTest {

	public static void main(String[] args) {
		ContactDao dao = new ContactDao();
		Contact contact = dao.getById((long) 2);
		
		contact.setName("Amanda");
		contact.setEmail("amanda@email.com");
		dao.update(contact);
	}

}
