package com.openclassrooms.tajmahal.ui.restaurant.submitRatings;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.openclassrooms.tajmahal.data.repository.RestaurantRepository;
import com.openclassrooms.tajmahal.data.service.RestaurantApi;
import com.openclassrooms.tajmahal.domain.model.Review;
import com.openclassrooms.tajmahal.ui.restaurant.submitRatings.SubmitRatingFragment;

import java.util.List;

import javax.inject.Inject;

import dagger.hilt.android.lifecycle.HiltViewModel;

/**
 * SubmitRatingViewModel is responsible for preparing and managing the data for the {@link SubmitRatingFragment}.
 * It communicates with the {@link RestaurantApi} to fetch restaurant ratings and provides
 * utility methods related to the restaurant API.
 *
 * This ViewModel is integrated with Hilt for dependency injection.
 */
@HiltViewModel
public class SubmitRatingViewModel extends ViewModel {
    private RestaurantRepository restaurantRepository;

    @Inject
    public SubmitRatingViewModel(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public LiveData<List<Review>> getRestaurantReviews() {
        return restaurantRepository.getReviews();

    }
}
