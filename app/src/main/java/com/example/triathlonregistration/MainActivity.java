package com.example.triathlonregistration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    int costPer = 725;
    int numberofAthletes;
    int totalCost;
    String userChoice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText athletes = (EditText)findViewById(R.id.athleteTxt);
        final Spinner group = (Spinner)findViewById(R.id.spinner);
        final TextView result = ((TextView)findViewById(R.id.txtResult));
        Button cost = (Button)findViewById(R.id.button);
        cost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberofAthletes = Integer.parseInt(athletes.getText().toString());
                totalCost = costPer * numberofAthletes;
                DecimalFormat total = new DecimalFormat("$###,###");
                userChoice = group.getSelectedItem().toString();
                result.setText(userChoice + " race team fee is " + total.format(totalCost));
            }
        });
    }
}
