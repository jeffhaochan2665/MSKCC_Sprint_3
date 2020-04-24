package com.wolfsoft.one.bronzeapp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ListView;

import com.txusballesteros.widgets.FitChart;
import com.txusballesteros.widgets.FitChartValue;

import java.util.ArrayList;
import java.util.Collection;

public class PieGraphActivity extends AppCompatActivity {

    private FitChart big;
    private FitChart small2;
    private FitChart small1;

    private ListView list;
    private GraphListLayoutAdapter graphListLayoutAdapter;


    int value1, value2,value3;

    private String[] TITLE = {"Mobility Trends","Emotion trends","See Recommendations"};
    private String[] SUB_TITLE = {"view details","view details","view details"};
    private String[] COLORS = {"#FF4081","#4cd2c7","#8284ab","#d7dafd","#faa75b","#f2c2ec","#ff527d","#4cd2c7","#8284ab"};

    private ArrayList<GraphList> graphListArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pie_graph);

        list = (ListView)findViewById(R.id.list);


        graphListArrayList = new ArrayList<GraphList>();

        for (int i=0; i<TITLE.length; i++){

            GraphList graphList = new GraphList(TITLE[i], SUB_TITLE[i], COLORS[i]);
            graphListArrayList.add(graphList);

        }

        /*
        list = (ListView) findViewById(R.id.list);
        graphListLayoutAdapter = new GraphListLayoutAdapter(PieGraphActivity.this, graphListArrayList);
        list.setAdapter(graphListLayoutAdapter);
        */
        big = (FitChart)findViewById(R.id.big);
        small2 = (FitChart)findViewById(R.id.small2);
        small1 = (FitChart)findViewById(R.id.small1);


        big.setMinValue(0);
        big.setMaxValue(100);

        small1.setMinValue(0);
        small1.setMaxValue(100);

        small2.setMinValue(0);
        small2.setMaxValue(100);

        value1 = 74;
        value2 = 40;
        value3 = 74;


        Collection<FitChartValue> valuesBig = new ArrayList<>();
        valuesBig.add(new FitChartValue(value1, Color.parseColor("#f6b45e")));

        Collection<FitChartValue> valuesSmall1 = new ArrayList<>();
        valuesSmall1.add(new FitChartValue(value2, Color.parseColor("#4edcc6")));

        Collection<FitChartValue> valuesSmall2 = new ArrayList<>();
        valuesSmall2.add(new FitChartValue(value3, Color.parseColor("#a176c8")));

        big.setValues(valuesBig);
        small1.setValues(valuesSmall1);
        small2.setValues(valuesSmall2);
    }

    public void toGraphActivity(View view) {
        Intent intent = new Intent(this, GraphActivity.class);
        startActivity(intent);
    }

    public void toEmotionActivity(View view) {
        Intent intent = new Intent(this, EmotionActivity.class);
        startActivity(intent);
    }

    public void toStickyListViewActivity(View view) {
        Intent intent = new Intent(this, StikListviewActtitvity.class);
        startActivity(intent);
    }

    public void toBigCalendarActivity(View view) {
        Intent intent = new Intent(this, BigCalendarActivity.class);
        startActivity(intent);
    }

}
