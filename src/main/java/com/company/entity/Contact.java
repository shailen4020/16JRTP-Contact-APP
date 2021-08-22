package com.company.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;

@Entity
@Table(name="CONTACT_DTLS")
@Data
public class Contact {

	@Id
	@GeneratedValue
	@Column(name="CONTACT_ID")
	private Integer contactId;
	
	@Column(name="CONTACT_NAME")
	private String contactName;

	@Column(name="CONTACT_EMAIL")
	private String contacEmail;
	
	@Column(name="CONTACT_CONTACTNUM")
	private Long ContactNumber;

	@Column(name="CONTACT_ACTIVESW")
	private Character activeSwitch;
	
	@Column(name="CONTACT_CREATEDATE")
	private LocalDate createdDate;
	
	@Column(name="CONTACT_DELETEDATE")
	private LocalDate deletedDate;
	
}
