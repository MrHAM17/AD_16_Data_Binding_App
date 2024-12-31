package com.example.twowaydatabinding;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;

import com.example.twowaydatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    // 99 % SAME Implementation Steps for --> Data Binding & 2 Way Data Binding
    // ONLY 3 DIFFERENCES ARE -->
    //        1. In XML layout for 2 way DB, respective textView & editText is added (here in this case step 7 & 8 in activity_main.xml file)
    //        2. In mainActivity.java, in 6th step(for DB) additional parameter i.e., "activityMainBinding" is passed to "MyClickHandler"
    //        3. In MyClickHandler.java class, in 2nd step(constructor)the passed parameter i.e., "activityMainBinding" is accepted




    // Step 1: Declare variables for binding and click handler
    private ActivityMainBinding activityMainBinding;
    private MyClickHandler myClickHandler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        // Step 2: Set the content view using data binding
        setContentView(R.layout.activity_main);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        // Step 3: Create a 'Person' object with sample data
        // Data Binding with TextView
        Person p1 = new Person("Jack", "jack@gmail.com");

        // Step 4: Initialize data binding for the activity
        activityMainBinding = DataBindingUtil.setContentView(
                this, R.layout.activity_main);

        // Step 5: Bind the 'Person' object to the layout
        activityMainBinding.setPerson(p1);

        // Step 6*: Create and bind the click handler for UI events
        // Binding the Handler for Click Events
        myClickHandler = new MyClickHandler(this, activityMainBinding);
        activityMainBinding.setClickHandler(myClickHandler);

    }
}