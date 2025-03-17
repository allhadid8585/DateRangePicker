package com.example.daterangepicker

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity: ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {

            DateRangePickerDialog(onDismissRequest = { /*TODO*/ }){ _, _ ->}

        }
    }
}