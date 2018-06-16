package com.example.nurislam.lesson13;

import android.hardware.input.InputManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView cat, dog;
private MediaPlayer catSound, dogSound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cat  = (ImageView)findViewById(R.id.cat);
        dog  = (ImageView)findViewById(R.id.dog);
        catSound = MediaPlayer.create(this, R.raw.cat);
        dogSound = MediaPlayer.create(this, R.raw.dog);

        imageClick ();

    }

    private void imageClick() {
        cat.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        soundPlay (catSound);
                    }
                }
        );
        dog.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        soundPlay (dogSound);
                    }
                }
        );
    }

    private void soundPlay(MediaPlayer sound) {
        sound.start();

    }
}
