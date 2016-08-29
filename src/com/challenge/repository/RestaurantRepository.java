package com.challenge.repository;

import org.springframework.stereotype.Repository;

import com.challenge.identity.Restaurant;

import lombok.Data;
@Data
@Repository
public class RestaurantRepository extends GenericRepository<Restaurant> {

}
