package com.challenge.identity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.challenge.identity.features.Login;
import com.sun.xml.internal.ws.developer.StreamingAttachment;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Data
@Entity
public class Customer implements Serializable {
	
	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private Login login;
	
	@NonNull
	private String name;
	
	@NonNull
	private String email;
}
