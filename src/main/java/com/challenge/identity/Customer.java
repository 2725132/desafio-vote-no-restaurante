package com.challenge.identity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.challenge.identity.features.Login;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Customer implements Serializable {
	


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@Transient
	private Login login;

	@NonNull
	private String lastName;
	
	@NonNull
	private String firstName;
	
	@NonNull
	private String email;
}
