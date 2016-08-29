package com.challenge.identity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.challenge.identity.features.Login;
import com.sun.xml.internal.ws.developer.StreamingAttachment;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
@Data
@Entity
public class Customer implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Transient
	private Login login;
	
	@NonNull
	private String name;
	
	@NonNull
	private String email;
}
