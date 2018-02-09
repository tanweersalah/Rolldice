package com.example.lucifer.snakeandladder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    public  void chnge() throws InterruptedException {

        Random ran = new Random();
        int x = ran.nextInt(6);
        int [] dices ={R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,R.drawable.six};
        ImageView dice =(ImageView)findViewById(R.id.imageView);

        dice.setImageResource(dices[x]);
        }

    public void roll(View view) throws InterruptedException {


        ImageView dice =(ImageView)findViewById(R.id.imageView);
        dice.animate().alpha(1).setDuration(1);
        dice.animate().rotationBy(900).setDuration(1000);









        chnge();}













    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
