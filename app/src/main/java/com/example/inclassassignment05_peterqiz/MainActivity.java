package com.example.inclassassignment05_peterqiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.Serializable;
import java.security.Key;

public class MainActivity extends AppCompatActivity {

    Game game;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner monthSpinner=findViewById(R.id.monthSpinner);
        ArrayAdapter<CharSequence>monthAdapter=ArrayAdapter.createFromResource(this,R.array.Month,R.layout.support_simple_spinner_dropdown_item);
        monthAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        monthSpinner.setAdapter(monthAdapter);

    }

        public void submit(View view){

            EditText titleBar=findViewById(R.id.gameTitle);
            String titleInput=titleBar.getText().toString();

            Spinner monthBar=findViewById(R.id.monthSpinner);
            String monthInput=monthBar.getSelectedItem().toString();

            EditText genreBar=findViewById(R.id.gameGenre);
            String genreInput=genreBar.getText().toString();

            CheckBox exclusiveBar=findViewById(R.id.exclusive);
            Boolean exclusiveInput=exclusiveBar.isChecked();

            this.game=new Game();
            game.setGameTitle(titleInput);
            game.setMonthOfRelease(monthInput);
            game.setGenre(genreInput);
            game.setConsoleExclusive(exclusiveInput);

        Intent preview=new Intent(this, GamePreview.class);
        preview.putExtra(Keys.GAME_KEY, game);
        startActivity(preview);
    }



}
