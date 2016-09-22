package challenge.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import challenge.identity.Restaurant;
import challenge.repository.RestaurantRepository;

@Service
public class RestaurantService {
	@Autowired
	private RestaurantRepository repository;
	
	@Autowired
	private RestaurantStatistics statistics;
	
	public int getVoteCount(Long id){
		Restaurant restaurant = repository.findById(id);
		return restaurant.getVoteCount();
	}
	
	public Restaurant findById(long id){
		return repository.findById(id);
	}
	
}
