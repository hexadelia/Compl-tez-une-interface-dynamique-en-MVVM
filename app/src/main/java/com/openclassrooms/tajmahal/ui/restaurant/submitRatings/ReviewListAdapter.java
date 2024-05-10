package com.openclassrooms.tajmahal.ui.restaurant.submitRatings;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.openclassrooms.tajmahal.domain.model.Review;

import java.util.List;

public class ReviewListAdapter extends RecyclerView.Adapter {
    private List<Review> reviews;

    public ReviewListAdapter(List<Review> reviews) {
        this.reviews = reviews;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }
}
