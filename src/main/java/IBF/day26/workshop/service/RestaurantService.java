package IBF.day26.workshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import IBF.day26.workshop.model.RestaurantModel;
import IBF.day26.workshop.repository.RestaurantRepository;

@Service
public class RestaurantService {

	@Autowired
	private RestaurantRepository restaurantRepo;

	public List<String> getCuisines() {
		return restaurantRepo.getCuisines();
	}

	public List<RestaurantModel> getRestaurantsByCuisine(String cuisine) {
		return restaurantRepo.getRestaurantsByCuisine(cuisine);
	}
}
