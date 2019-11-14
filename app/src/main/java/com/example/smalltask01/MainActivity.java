package com.example.smalltask01;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void generateRandomNumber()
    {
        Random rand = new Random();
        randomNumber = rand.nextInt(20)+1;
    }

    public void guess(View view)
    {
        EditText editText = (EditText)findViewById(R.id.edit1);

        int guessNumber = Integer.parseInt(editText.getText().toString());

        String msg;

        if(guessNumber == randomNumber)
        {
            msg = "yay! you got me right!";
            generateRandomNumber();
        }
        else
        {
            msg = "Sorry Better luck next time";
            generateRandomNumber();
        }
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
        Log.i("Entered Value",editText.getText().toString());
        Log.i("Random Number    ",Integer.toString(randomNumber));


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);









    }
}
