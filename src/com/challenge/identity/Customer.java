package com.challenge.identity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

import com.challenge.identity.features.Login;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
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
	private String name;
	
	@NonNull
	private String email;
}
