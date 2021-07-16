package com.example.androiddiceapppractice;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Random;

public class RollDiceScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolldice);


        ImageView img_dice1=findViewById(R.id.img_dice1);
        ImageView img_dice2=findViewById(R.id.img_dice2);

        int[] arr_diceImg={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6,

        };

        MediaPlayer mediaPlayer= MediaPlayer.create(this, R.raw.dice_sound);

        Button b=findViewById(R.id.btn_rollDice);

        b.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        Random randomObj= new Random();
                        mediaPlayer.start();

                        int rNo1=randomObj.nextInt(6); // 0....6
                        int rNo2=randomObj.nextInt(6); // 0....6

                        img_dice1.setImageResource(arr_diceImg[rNo1]);
                        img_dice2.setImageResource(arr_diceImg[rNo2]);

                        // Animation - shake img
                        YoYo.with(Techniques.Shake).
                                duration(100)
                                .repeat(5)
                                .playOn(img_dice1);
                        YoYo.with(Techniques.Shake)
                                .duration(100)
                                .repeat(5)
                                .playOn(img_dice2);

                        mediaPlayer.start();
                    }
                }
        );
    }
}