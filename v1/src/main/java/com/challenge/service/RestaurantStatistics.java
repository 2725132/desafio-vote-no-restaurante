package challenge.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.challenge.service.RestaurantService;
import com.challenge.identity.Restaurant;
import com.challenge.repository.RestaurantRepository;
import lombok.Getter;

@Service
public class RestaurantStatistics {	
	@Autowired
	private RestaurantService service;
	
	public float getVoteResults(Long id){
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurants.add(service.findById((long) 1));
		restaurants.add(service.findById((long) 2));
		restaurants.add(service.findById((long) 3));
		int votesOfRestaurant = service.getVoteCount(id);
		return calculate(votesOfRestaurant, restaurants);
	}

	public float calculate(int votes, List<Restaurant> restaurants) {
		int count = 0;
		for(Restaurant r : restaurants){
			count += r.getVoteCount();
		}
		
		return votes/count;
	}
	
	
	
}
