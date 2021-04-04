package com.example.lemparcoinleli;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class LemparCoin extends Activity implements View.OnClickListener {
    private Button buttonLempar;
    private Button buttonulang;
    private Button buttonkeluar;
    private Random acak;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        acak= new Random();
        setContentView(R.layout.activity_lemparcoin);
        buttonLempar=(Button)findViewById(R.id.buttonlempar);
        buttonulang=(Button)findViewById(R.id.buttonulang);
        buttonkeluar=(Button)findViewById(R.id.buttonkeluar);
        buttonLempar.setOnClickListener(this);
        buttonulang.setOnClickListener(this);
        buttonkeluar.setOnClickListener(this);


    }
    @Override
    public void onClick(View view) {

        if (view==buttonLempar) {
           Log.d("CLICK_EVENT", "Lempar button diClick");
            TextView tw=(TextView)findViewById(R.id.textView);
            ImageView w=(ImageView)findViewById(R.id.imageView);

            if (acak.nextDouble() < 0.5) {
                tw.setText("kepala");
                w.setImageResource(R.drawable.head);
            } else {
                tw.setText("Cross");
                w.setImageResource(R.drawable.tail);
            }
            buttonLempar.setVisibility(View.INVISIBLE);
            buttonulang.setVisibility(View.VISIBLE);
            buttonkeluar.setVisibility(View.VISIBLE);
        }

        else if (view==buttonulang) {
            TextView tw=(TextView)findViewById(R.id.textView);
            ImageView w=(ImageView)findViewById(R.id.imageView);

            buttonLempar.setVisibility(View.VISIBLE);
            buttonulang.setVisibility(View.INVISIBLE);
            buttonkeluar.setVisibility(View.INVISIBLE);

        }else if (view==buttonkeluar) {
            this.finish();
        }
    }
}
