package com.wolfsoft.one.bronzeapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.Arrays;

public class ListActivity extends AppCompatActivity {

    private boolean[] questionsAnswered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_layout);
        Arrays.fill(questionsAnswered, false);
    }

    public void onRadioButtonClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        switch(view.getId()) {
            case R.id.q1_ans1:
                questionsAnswered[0] = true;
                break;
            case R.id.q1_ans2:
                questionsAnswered[0] = true;
                break;
            case R.id.q1_ans3:
                questionsAnswered[0] = true;
                break;
            case R.id.q1_ans4:
                questionsAnswered[0] = true;
                break;
            case R.id.q2_ans1:
                questionsAnswered[1] = true;
                break;
            case R.id.q2_ans2:
                questionsAnswered[1] = true;
                break;
            case R.id.q2_ans3:
                questionsAnswered[1] = true;
                break;
            case R.id.q2_ans4:
                questionsAnswered[1] = true;
                break;
            case R.id.q3_ans1:
                questionsAnswered[2] = true;
                break;
            case R.id.q3_ans2:
                questionsAnswered[2] = true;
                break;
            case R.id.q3_ans3:
                questionsAnswered[2] = true;
                break;
            case R.id.q3_ans4:
                questionsAnswered[2] = true;
                break;
            default:
                break;
        }
    }
}
