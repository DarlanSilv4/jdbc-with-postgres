package br.com.jdbc.test;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.jdbc.dao.ContactDao;
import br.com.jdbc.model.Contact;

public class SearchByNameTest {

	public static void main(String[] args) {
		ContactDao dao = new ContactDao();
		List<Contact> contacts = dao.searchByName("EMILLY");
		
		String pattern = "dd/MM/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		for (Contact contact : contacts) {
			System.out.println("Name: "+ contact.getName());
			System.out.println("Email: "+ contact.getEmail());
			System.out.println("Address: "+ contact.getAddress());
			
			Date date = contact.getBirthday().getTime();
			String formattedDate = simpleDateFormat.format(date);
			System.out.println("Birthday: "+ formattedDate+ "\n");
		}
	}

}
