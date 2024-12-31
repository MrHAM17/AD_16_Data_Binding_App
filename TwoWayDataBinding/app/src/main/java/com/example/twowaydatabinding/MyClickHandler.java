package com.example.twowaydatabinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

import com.example.twowaydatabinding.MainActivity;
import com.example.twowaydatabinding.databinding.ActivityMainBinding;

public class MyClickHandler {

    // Step 1: Declare context and binding variables
    Context context;
    ActivityMainBinding activityMainBinding;

    // Step 2*: Constructor to initialize context and binding
    public MyClickHandler(Context context, ActivityMainBinding activityMainBinding) {
        this.context = context;
        this.activityMainBinding = activityMainBinding;
    }

    // Step 3: Define the click handler for the button
    public void onButton1Clicked(View view) {
        // Display a toast message when the button is clicked
        Toast.makeText(
                context,
                "You Clicked the button",
                Toast.LENGTH_SHORT).show();
    }
}