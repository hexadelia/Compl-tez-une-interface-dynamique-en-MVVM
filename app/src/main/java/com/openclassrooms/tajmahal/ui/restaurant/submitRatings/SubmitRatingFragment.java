package com.openclassrooms.tajmahal.ui.restaurant.submitRatings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.openclassrooms.tajmahal.databinding.FragmentSubmitRatingBinding;
import com.openclassrooms.tajmahal.domain.model.Review;

import java.util.List;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class SubmitRatingFragment extends Fragment {

    private FragmentSubmitRatingBinding bindings;
    private SubmitRatingViewModel submitRatingViewModel;

    public static Fragment createNewInstance() {
        return new SubmitRatingFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        bindings = FragmentSubmitRatingBinding.inflate(inflater, container, false);
        return bindings.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        submitRatingViewModel = new ViewModelProvider(this).get(SubmitRatingViewModel.class);
        submitRatingViewModel.getRestaurantReviews().observe(requireActivity(), this::reviewsChanged);
    }

    /**
     * Method called when reviews changed
     * @param reviews
     */
    private void reviewsChanged(List<Review> reviews) {
        bindings.commentNestedScrollview.setAdapter(new ReviewListAdapter(reviews));
    }
}
