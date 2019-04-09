package com.example.avshek.dicee;

import android.os.Bundle;
//import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = findViewById(R.id.rollButton);

        final ImageView leftDice = findViewById(R.id.image_leftDice);

        final ImageView rightDice = findViewById(R.id.image_rightDice);

        //final ImageView middleDice = findViewById(R.id.image_middleDice);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Log.d("Dicee","Button has been pressed.");
//
//                Random randomNumberGenerator = new Random();
//
//                int number = randomNumberGenerator.nextInt(6);
//
//                Log.d("Dicee","The random numebr is :" + number);
//
//                leftDice.setImageResource(diceArray[number]);
//
//                number = randomNumberGenerator.nextInt(6);
//                Log.d("Dicee","The random numebr is :" + number);
//
//                rightDice.setImageResource(diceArray[number]);

                //number = randomNumberGenerator.nextInt(6);
               // middleDice.setImageResource(diceArray[number]);

                Random randomNumberGenerator1 = new Random();
                int numbr1 = randomNumberGenerator1.nextInt(6);
                leftDice.setImageResource(diceArray[numbr1]);

                numbr1 = randomNumberGenerator1.nextInt(6);
                rightDice.setImageResource(diceArray[numbr1]);


            }
        });
    }
}
