package com.example.trial_v1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {

    TextView tv1, tv5, tv7, tv8;
    ProgressBar progr1, progr2, progr3;
    ImageView c1, c2, c3, w1, w2, w3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tv1 = findViewById(R.id.textView3);
        tv5 = findViewById(R.id.textView5);
        tv8 = findViewById(R.id.textView8);
        tv7 = findViewById(R.id.textView7);
        progr1 = findViewById(R.id.progressBar2);
        progr2 = findViewById(R.id.progressBar3);
        progr3 = findViewById(R.id.progressBar4);
        c1 = findViewById(R.id.imageView2);
        c2 = findViewById(R.id.imageView3);
        c3 = findViewById(R.id.imageView4);
        w1 = findViewById(R.id.imageView5);
        w2 = findViewById(R.id.imageView6);
        w3 = findViewById(R.id.imageView7);

        int physical_score = (int)getIntent().getFloatExtra("Kphysicalscore1", 0);
        int sentiment_score = (int)getIntent().getFloatExtra("Ksentimentscore1", 0);
        int active_score = (int) getIntent().getFloatExtra("Kactivescore1", 0);
        int sleep_score = (int) getIntent().getFloatExtra("Ksleepscore1", 0);

        if(sentiment_score>100){
            sentiment_score = sentiment_score-100;
        }

        float distance = getIntent().getFloatExtra("Kdistance", 0);
        float calorie = getIntent().getFloatExtra("Kcalorie", 0);
        float step_count = getIntent().getFloatExtra("Kstepcount", 0);
        float time_sedentary = getIntent().getFloatExtra("Ktimesedentary", 0);
        float time_lightly_active = getIntent().getFloatExtra("Ktimelightlyactive", 0);
        float time_moderately_active = getIntent().getFloatExtra("Ktimemoderatelyactive", 0);
        float time_very_active = getIntent().getFloatExtra("Ktimeveryactive", 0);
        float composition_score = getIntent().getFloatExtra("Kcompositionscore", 0);
        float revitalization_score = getIntent().getFloatExtra("Krevitalizationscore", 0);
        float duration_score = getIntent().getFloatExtra("Kdurationscore", 0);
        float deep_sleep = getIntent().getFloatExtra("Kdeepsleep", 0);
        float resting_heart_rate = getIntent().getFloatExtra("Krestingheartrate", 0);
        float restlessness = getIntent().getFloatExtra("Krestlessness", 0);
        float sleep_efficiency = getIntent().getFloatExtra("Ksleepefficiency", 0);
        float time_asleep = getIntent().getFloatExtra("Ktimeasleep", 0);
        float time_awake = getIntent().getFloatExtra("Ktimeawake", 0);
        float time_in_bed = getIntent().getFloatExtra("Ktimeinbed", 0);
        float sleep_duration = getIntent().getFloatExtra("Ksleepduration", 0);
        float fatigue = getIntent().getFloatExtra("Kfatigue", 0);
        float mood = getIntent().getFloatExtra("Kmood", 0);
        float soreness = getIntent().getFloatExtra("Ksoreness", 0);
        float stress = getIntent().getFloatExtra("Kstress", 0);

        progr1.setProgress(physical_score);
        progr2.setProgress(sentiment_score);
        progr3.setProgress(active_score);
        tv5.setText(physical_score+"%");
        tv7.setText(sentiment_score+"%");
        tv8.setText(active_score+"%");

        if(physical_score<80){
            c1.setVisibility(View.INVISIBLE);
        }
        else{
            w1.setVisibility(View.INVISIBLE);
        }

        if(sentiment_score<80){
            c2.setVisibility(View.INVISIBLE);
        }
        else {
            w2.setVisibility(View.INVISIBLE);
        }

        if(active_score<80){
            c3.setVisibility(View.INVISIBLE);
        }
        else{
            w3.setVisibility(View.INVISIBLE);
        }

//        tv1.setText(physical_score + "\n" + sentiment_score +"\n"+active_score+"\n"+sleep_score);
//        Log.i("phy3-", String.valueOf(physical_score));
//        Log.i("sleep3-", String.valueOf(sleep_score));
        StringBuilder result = new StringBuilder();

        if(physical_score<80){
           result.append("Your Physical Activity is very less.\n");
            if(soreness!=3){
                if(soreness>3){
                    result.append("Don't do vigorous physical activities for more than one hour, it can cause health issues.\n");
                }
            }
        }
        if(active_score<80){
            result.append("You should try to do more vigorous activities(atleast 60 minutes) and 120minutes of moderate activity.\n");
        }


        if(sentiment_score<80){

            if(mood!=3){
                if(mood<3){
                    result.append("From the rating entered, you seem sad due to which you are facing sleeplessness.\n");
                }
                else{
                    result.append("From the rating entered, you seem very happy, due to which anxiety increase and cause sleeplessness.\n");
                }
            }

            if(stress!=3){
                result.append("From the rating entered, your stress level is not normal.\n");
            }
        }

        Log.i("sleep score: ", String.valueOf(sleep_score));
        if(sleep_score<80){
            if(resting_heart_rate<40 || resting_heart_rate>50){
                result.append("Your heart rate during sleep is not normal.\n");
            }
            if(sleep_duration<6){
                result.append("You don't take enough sleep hours. Atleast take 6-8 hours of sleep.\n");
            }
            if(restlessness>0.1){
                result.append("You are very restless.\n");
            }
        }

        Log.i("activity3" , String.valueOf(result));
        tv1.setText(result);

    }
}