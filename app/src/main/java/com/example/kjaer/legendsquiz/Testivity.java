package com.example.kjaer.legendsquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class Testivity extends AppCompatActivity {
    HttpTest testy;
    TextView textResponse;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testivity);

        try {
            testy = new HttpTest();
        }
        catch (Exception e){

        }

       textResponse = (TextView) findViewById(R.id.jensenstest);
        textResponse.setText(testy.getTestResponse());



    }

}
