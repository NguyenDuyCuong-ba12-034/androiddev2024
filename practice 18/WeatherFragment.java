package com.example.usthweather;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WeatherFragment extends Fragment {

    private ImageView weatherIcon;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_weather, container, false);

        // Initialize the weather icon ImageView
        weatherIcon = view.findViewById(R.id.weather_icon);

        // Set up the click listener to halve the icon size on each click
        weatherIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Get the current width and height of the icon
                int currentWidth = weatherIcon.getWidth();
                int currentHeight = weatherIcon.getHeight();

                // Set new size to half of the current size
                int newWidth = currentWidth / 2;
                int newHeight = currentHeight / 2;

                // Apply the new width and height to the ImageView
                weatherIcon.getLayoutParams().width = newWidth;
                weatherIcon.getLayoutParams().height = newHeight;
                weatherIcon.requestLayout(); // Refresh layout to apply new size
            }
        });

        return view;
    }
}
