package com.example.trial_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ed1, ed2, ed3, ed4, ed5, ed6, ed7, ed8, ed9, ed10, ed11, ed12, ed13, ed14, ed15, ed16, ed17, ed18;
    Button next;
    float physical_score, sentiment_score, active_score, sleep_score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ed1 =findViewById(R.id.editTextNumberDecimal); //Distance
        ed2 = findViewById(R.id.editTextNumberDecimal4); //Calorie
        ed3 =findViewById(R.id.editTextNumberDecimal3); //Step Count
        ed4 =findViewById(R.id.editTextNumberDecimal2); //Time Sedentary
        ed5 =findViewById(R.id.editTextNumberDecimal6); //Time Lightly Active
        ed6 =findViewById(R.id.editTextNumberDecimal5); // Time Moderately Active
        ed7 =findViewById(R.id.editTextNumberDecimal8); //Time Very Active
        ed8 =findViewById(R.id.editTextNumberDecimal7); //Composition Score
        ed9 =findViewById(R.id.editTextNumberDecimal10); //Revitalization Score
        ed10 =findViewById(R.id.editTextNumberDecimal9); //Duration Score
        ed11 =findViewById(R.id.editTextNumberDecimal12); //Deep Sleep
        ed12 =findViewById(R.id.editTextNumberDecimal11); //Resting Heart Rate
        ed13 =findViewById(R.id.editTextNumberDecimal16); //Restlessness
        ed14 =findViewById(R.id.editTextNumberDecimal15); //Sleep Efficiency
        ed15 =findViewById(R.id.editTextNumberDecimal18); //Time Asleep
        ed16 =findViewById(R.id.editTextNumberDecimal17); //Time Awake
        ed17 =findViewById(R.id.editTextNumberDecimal22); //Time in Bed
        ed18 =findViewById(R.id.editTextNumberDecimal21); //Sleep Duration

        next = findViewById(R.id.button);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float distance = Float.parseFloat(ed1.getText().toString());
                float calorie = Float.parseFloat(ed2.getText().toString());
                float step_count = Float.parseFloat(ed3.getText().toString());
                float time_sedentary = Float.parseFloat(ed4.getText().toString());
                float time_lightly_active = Float.parseFloat(ed5.getText().toString());
                float time_moderately_active = Float.parseFloat(ed6.getText().toString());
                float time_very_active = Float.parseFloat(ed7.getText().toString());
                float composition_score = Float.parseFloat(ed8.getText().toString());
                float revitalization_score = Float.parseFloat(ed9.getText().toString());
                float duration_score = Float.parseFloat(ed10.getText().toString());
                float deep_sleep = Float.parseFloat(ed11.getText().toString());
                float resting_heart_rate = Float.parseFloat(ed12.getText().toString());
                float restlessness = Float.parseFloat(ed13.getText().toString());
                float sleep_efficiency = Float.parseFloat(ed14.getText().toString());
                float time_asleep = Float.parseFloat(ed15.getText().toString());
                float time_awake = Float.parseFloat(ed16.getText().toString());
                float time_in_bed = Float.parseFloat(ed17.getText().toString());
                float sleep_duration = Float.parseFloat(ed18.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity1.class);
                intent.putExtra("Kdistance", distance);
                intent.putExtra("Kcalorie", calorie);
                intent.putExtra("Kstepcount", step_count);
                intent.putExtra("Ktimesedentary", time_sedentary);
                intent.putExtra("Ktimelightlyactive", time_lightly_active);
                intent.putExtra("Ktimemoderatelyactive", time_moderately_active);
                intent.putExtra("Ktimeveryactive", time_very_active);
                intent.putExtra("Kcompositionscore", composition_score);
                intent.putExtra("Krevitalizationscore", revitalization_score);
                intent.putExtra("Kdurationscore", duration_score);
                intent.putExtra("Kdeepsleep", deep_sleep);
                intent.putExtra("Krestingheartrate", resting_heart_rate);
                intent.putExtra("Krestlessness", restlessness);
                intent.putExtra("Ksleepefficiency", sleep_efficiency);
                intent.putExtra("Ktimeasleep", time_asleep);
                intent.putExtra("Ktimeawake", time_awake);
                intent.putExtra("Ktimeinbed", time_in_bed);
                intent.putExtra("Ksleepduration", sleep_duration);
                startActivity(intent);

            }
        });


    }
}