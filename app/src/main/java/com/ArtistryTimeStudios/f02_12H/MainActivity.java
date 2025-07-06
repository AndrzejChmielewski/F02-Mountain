package com.ArtistryTimeStudios.f02_12H;

import androidx.appcompat.app.AppCompatActivity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.artistrytimestudios.f02_12H.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the "Installation Guide" button by its ID
        Button guideButton = findViewById(R.id.guideButton);

        // Set a click listener for the "Installation Guide" button
        guideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Define the URL of your installation guide and create an Intent to open it
                String guideUrl = "https://tinyurl.com/4p9rcmww"; // Replace with your installation guide URL
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(guideUrl));

                // Start the activity to open the installation guide link
                startActivity(intent);
            }
        });

    }
}
