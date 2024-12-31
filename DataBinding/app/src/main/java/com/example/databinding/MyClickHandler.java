package com.example.databinding;

import android.content.Context;
import android.view.View;
import android.widget.Toast;


public class MyClickHandler {

    // Step 1: Declare context and binding variables
    Context context;

    // Step 2: Constructor to initialize context
    public MyClickHandler(Context context) {
        this.context = context;
    }

    // Step 3: Define the click handler for the button
    public void onButton1Clicked(View view) {
        // Display a toast message when the button is clicked
        Toast.makeText(
                context,
                "First Button is Clicked",
                Toast.LENGTH_SHORT).show();
    }
}
