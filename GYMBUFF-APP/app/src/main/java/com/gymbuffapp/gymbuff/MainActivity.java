package com.gymbuffapp.gymbuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Boolean isFirstRun = getSharedPreferences("PREFERENCE", MODE_PRIVATE)
                .getBoolean("isFirstRun", true);

        if (isFirstRun) {
            //show start activity

            startActivity(new Intent(MainActivity.this, FirstTime.class));
            Toast.makeText(MainActivity.this, "First Run", Toast.LENGTH_LONG)
                    .show();
        }


        getSharedPreferences("PREFERENCE", MODE_PRIVATE).edit()
                .putBoolean("isFirstRun", false).commit();
    }

    public void settingsOnClick(View view) {
        Toast.makeText(MainActivity.this, "Settings have not been implemented yet.", Toast.LENGTH_SHORT).show();
    }

    public void startWorkout(View view){
        Toast.makeText(MainActivity.this, "Workouts have not been implemeted yet.", Toast.LENGTH_SHORT).show();
    }

    public void startRun(View view){
        Toast.makeText(MainActivity.this, "Runs have not been implemeted yet.", Toast.LENGTH_SHORT).show();
    }

    public void dietDiary(View view){
        Toast.makeText(MainActivity.this, "The diet diary has not been implemeted yet.", Toast.LENGTH_SHORT).show();
    }

    public void createWorkout(View view){
        Toast.makeText(MainActivity.this, "Creating workouts has not been implemeted yet.", Toast.LENGTH_SHORT).show();
    }

    public void progressPhoto(View view){
        Toast.makeText(MainActivity.this, "Progress photos have not been implemeted yet.", Toast.LENGTH_SHORT).show();
    }

    public void workoutDiary(View view){
        Toast.makeText(MainActivity.this, "Workout diaries have not been implemeted yet.", Toast.LENGTH_SHORT).show();
    }
}
