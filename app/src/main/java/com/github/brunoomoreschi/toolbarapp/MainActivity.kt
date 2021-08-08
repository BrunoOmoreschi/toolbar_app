package com.github.brunoomoreschi.toolbarapp

/*
Disclaimer

This is an example app to show toolbar implementation.
The case is that in the DIO bootcamp for inter bank they seems to have used a previous
recorded classes from other bootcamp. The first problem is that some methods are now
deprecated and not working, so.. the code needs to be updated, but, this is not a problem for DIO.
Because they dont give the github code, so even been outdated the class only gives a explanation
about some feature and dont need to cover the entire code.
The thing is... well, for most beginners, some basic features are really hard to implement, like
this one covered on this app. Implementation of a toolbar is not just call the function or put the
element on layout since we are actually overriding a theme for android.
At this moment calling the UI elements on the code is made by using the resource findById, but when
the classes were recorded they was calling it using a more directly, and now deprecated form. The
jetpack compose already has been realised, but still is not the industry standard, so I will not use
it here. But this app may need to be refactored or created another version to cover this new method.

To do the toolbar implementation I will follow this tutorial: https://www.youtube.com/watch?v=e53cf9mglH8
and some official adjustments in order to make it as far as possible to be used as a template.

Please use the readme to see the steps.*/

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity() {
    //private Toolbar toolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.customizedToolbar)
        setSupportActionBar(toolbar)
        toolbar.subtitle = "This is another test!"
    }
}