package com.wolfsoft.one.bronzeapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import android.support.design.widget.FloatingActionButton;

public class ListActivity extends AppCompatActivity {

    private boolean[] questionsAnswered = new boolean[3];
    private FloatingActionButton submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_layout);
        submitButton = (FloatingActionButton) findViewById(R.id.submit_button);
        submitButton.setVisibility(View.INVISIBLE);
    }

    public void onButtonClick(View view) {
        switch(view.getId()) {
            case R.id.q1_ans1:
                questionsAnswered[0] = true;
                findViewById(R.id.q1_ans1).setBackgroundColor(Color.parseColor("#21CC7C"));
                findViewById(R.id.q1_ans2).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q1_ans3).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q1_ans4).setBackgroundColor(Color.parseColor("#21A690"));
                break;
            case R.id.q1_ans2:
                questionsAnswered[0] = true;
                findViewById(R.id.q1_ans1).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q1_ans2).setBackgroundColor(Color.parseColor("#21CC7C"));
                findViewById(R.id.q1_ans3).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q1_ans4).setBackgroundColor(Color.parseColor("#21A690"));
                break;
            case R.id.q1_ans3:
                questionsAnswered[0] = true;
                findViewById(R.id.q1_ans1).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q1_ans2).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q1_ans3).setBackgroundColor(Color.parseColor("#21CC7C"));
                findViewById(R.id.q1_ans4).setBackgroundColor(Color.parseColor("#21A690"));
                break;
            case R.id.q1_ans4:
                questionsAnswered[0] = true;
                findViewById(R.id.q1_ans1).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q1_ans2).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q1_ans3).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q1_ans4).setBackgroundColor(Color.parseColor("#21CC7C"));
                break;
            case R.id.q2_ans1:
                questionsAnswered[1] = true;
                findViewById(R.id.q2_ans1).setBackgroundColor(Color.parseColor("#21CC7C"));
                findViewById(R.id.q2_ans2).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q2_ans3).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q2_ans4).setBackgroundColor(Color.parseColor("#21A690"));
                break;
            case R.id.q2_ans2:
                questionsAnswered[1] = true;
                findViewById(R.id.q2_ans1).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q2_ans2).setBackgroundColor(Color.parseColor("#21CC7C"));
                findViewById(R.id.q2_ans3).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q2_ans4).setBackgroundColor(Color.parseColor("#21A690"));
                break;
            case R.id.q2_ans3:
                questionsAnswered[1] = true;
                findViewById(R.id.q2_ans1).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q2_ans2).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q2_ans3).setBackgroundColor(Color.parseColor("#21CC7C"));
                findViewById(R.id.q2_ans4).setBackgroundColor(Color.parseColor("#21A690"));
                break;
            case R.id.q2_ans4:
                questionsAnswered[1] = true;
                findViewById(R.id.q2_ans1).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q2_ans2).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q2_ans3).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q2_ans4).setBackgroundColor(Color.parseColor("#21CC7C"));
                break;
            case R.id.q3_ans1:
                questionsAnswered[2] = true;
                findViewById(R.id.q3_ans1).setBackgroundColor(Color.parseColor("#21CC7C"));
                findViewById(R.id.q3_ans2).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q3_ans3).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q3_ans4).setBackgroundColor(Color.parseColor("#21A690"));
                break;
            case R.id.q3_ans2:
                questionsAnswered[2] = true;
                findViewById(R.id.q3_ans1).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q3_ans2).setBackgroundColor(Color.parseColor("#21CC7C"));
                findViewById(R.id.q3_ans3).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q3_ans4).setBackgroundColor(Color.parseColor("#21A690"));
                break;
            case R.id.q3_ans3:
                questionsAnswered[2] = true;
                findViewById(R.id.q3_ans1).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q3_ans2).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q3_ans3).setBackgroundColor(Color.parseColor("#21CC7C"));
                findViewById(R.id.q3_ans4).setBackgroundColor(Color.parseColor("#21A690"));
                break;
            case R.id.q3_ans4:
                questionsAnswered[2] = true;
                findViewById(R.id.q3_ans1).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q3_ans2).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q3_ans3).setBackgroundColor(Color.parseColor("#21A690"));
                findViewById(R.id.q3_ans4).setBackgroundColor(Color.parseColor("#21CC7C"));
                break;
        }
        updateSubmitButton();
    }

    private void updateSubmitButton() {
        boolean submitted = questionsAnswered[0] && questionsAnswered[1] && questionsAnswered[2];
        if (submitted) {
            submitButton.setVisibility(View.VISIBLE);
        } else {
            submitButton.setVisibility(View.INVISIBLE);
        }
    }

    public void submit(View view) {
        Intent intent = new Intent(this, PieGraphActivity.class);
        startActivity(intent);
    }
}
