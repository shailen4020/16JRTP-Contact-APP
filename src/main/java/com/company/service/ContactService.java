package com.company.service;


import java.util.List;

import com.company.entity.Contact;


	public interface ContactService {
	
				public boolean saveContct(Contact contact);
				
				public List<Contact>  getAllContacts();
				
				public Contact getcontactById(Integer cId);
								
				public boolean deletById(Integer cID);

}
