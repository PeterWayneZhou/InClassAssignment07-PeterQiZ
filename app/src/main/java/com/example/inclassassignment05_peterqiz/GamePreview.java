package com.example.inclassassignment05_peterqiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class GamePreview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_preview);

        TextView titleDisplay=findViewById(R.id.titlePreview);
        TextView monthDisplay=findViewById(R.id.releasePreview);
        TextView genreDisplay=findViewById(R.id.genrePreview);
        TextView exclusiveDisplay=findViewById(R.id.exclusivePreview);

        Intent checkTheGame=getIntent();
        Game game=(Game)checkTheGame.getSerializableExtra(Keys.GAME_KEY);

        titleDisplay.setText(game.getGameTitle());
        monthDisplay.setText("The game will be released in "+game.getMonthOfRelease()+" 2020.");
        genreDisplay.setText("The genre of the game is "+game.getGenre()+".");
        if(game.getConsoleExclusive()==true){
            exclusiveDisplay.setText("It is a console exclusive game.");
        }else{
            exclusiveDisplay.setText("It isn't a console exclusive game.");
        }

    }
}
