package com.wolfsoft.one.bronzeapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;

import android.support.design.widget.FloatingActionButton;

import java.util.Arrays;

public class ListActivity extends AppCompatActivity {

    private boolean[] questionsAnswered = new boolean[3];
    private FloatingActionButton submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_layout);
        Arrays.fill(questionsAnswered, false);
        submitButton = (FloatingActionButton) findViewById(R.id.submit_button);
        submitButton.setVisibility(View.INVISIBLE);
    }

    public void onRadioButtonClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.q1_ans1:
                if (checked) {questionsAnswered[0] = true;}
                updateSubmitButton();
                break;
            case R.id.q1_ans2:
                if (checked) {questionsAnswered[0] = true;}
                updateSubmitButton();
                break;
            case R.id.q1_ans3:
                if (checked) {questionsAnswered[0] = true;}
                updateSubmitButton();
                break;
            case R.id.q1_ans4:
                if (checked) {questionsAnswered[0] = true;}
                updateSubmitButton();
                break;
            case R.id.q2_ans1:
                if (checked) {questionsAnswered[1] = true;}
                updateSubmitButton();
                break;
            case R.id.q2_ans2:
                if (checked) {questionsAnswered[1] = true;}
                updateSubmitButton();
                break;
            case R.id.q2_ans3:
                if (checked) {questionsAnswered[1] = true;}
                updateSubmitButton();
                break;
            case R.id.q2_ans4:
                if (checked) {questionsAnswered[1] = true;}
                updateSubmitButton();
                break;
            case R.id.q3_ans1:
                if (checked) {questionsAnswered[2] = true;}
                updateSubmitButton();
                break;
            case R.id.q3_ans2:
                if (checked) {questionsAnswered[2] = true;}
                updateSubmitButton();
                break;
            case R.id.q3_ans3:
                if (checked) {questionsAnswered[2] = true;}
                updateSubmitButton();
                break;
            case R.id.q3_ans4:
                if (checked) {questionsAnswered[2] = true;}
                updateSubmitButton();
                break;
            default:
                break;
        }
    }

    private void updateSubmitButton() {
        boolean submitted = questionsAnswered[0] && questionsAnswered[1] && questionsAnswered[2];
        Log.e("JEFF", String.valueOf(submitted));
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
