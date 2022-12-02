package br.com.jdbc.test;

import br.com.jdbc.dao.ContactDao;
import br.com.jdbc.model.Contact;

public class DeleteTest {

	public static void main(String[] args) {
		ContactDao dao = new ContactDao();
		Contact contact = dao.getById((long) 4);
		dao.delete(contact);

	}

}
