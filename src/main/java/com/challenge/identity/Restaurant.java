package com.challenge.identity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Data;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
public class Restaurant implements Serializable, Comparable<Restaurant> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2978005646652592496L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NonNull
	private String name;
	
	@NonNull
	private int voteCount;

	public int incrementVotes() {
		this.voteCount++;
		return voteCount;
	}
	
	public int compareTo(Restaurant restaurant) {
		return  restaurant.getVoteCount() - this.getVoteCount();

	}


	
}
