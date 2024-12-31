package com.example.databinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

public class Person extends BaseObservable {

    // Step 1: Declare properties for name and email
    String name;
    String email;

    // Step 2: Constructor to initialize the properties
    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Step 3: Create a getter for 'name' with @Bindable annotation
    @Bindable
    public String getName() {
        return name;
    }

    // Step 4: Create a setter for 'name' and notify changes to update the UI
    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    // Step 5: Create a getter and setter for 'email' (not bindable)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Step 6: Provide a default constructor (optional)
    public Person() {
    }
}
