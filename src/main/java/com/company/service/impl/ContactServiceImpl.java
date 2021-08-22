package com.company.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.company.entity.Contact;
import com.company.repository.ContactRepository;
import com.company.service.ContactService;

@Service
public class ContactServiceImpl  implements ContactService{
	
	ContactRepository contactRepository;
	
	@Override
	public boolean saveContct(Contact contact) {
		// TODO Auto-generated method stub		
		boolean status= contactRepository.save(contact).equals(contact);
		return status;
	}
	
	@Override
	public List<Contact> getAllContacts() {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}
	
	@Override
	public Contact getcontactById(Integer cId) {
		
		return contactRepository.findById(cId).get();
//		return contactRepository.getById(cId);
	}
	
	
	@Override
	public boolean deletById(Integer cId) {
		// TODO Auto-generated method stub
		
		boolean status= contactRepository.delete(cId);
		return status;
	}
	
}
