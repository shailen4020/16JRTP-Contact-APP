package com.company.repository;


import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.company.entity.Contact;

// special interface 
public interface ContactRepository extends JpaRepository<Contact,Serializable>
{

	
	
	
}
