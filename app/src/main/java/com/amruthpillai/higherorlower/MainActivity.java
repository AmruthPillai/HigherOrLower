package com.amruthpillai.higherorlower;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random random = new Random();

    EditText guessEditText;
    Button guessButton;

    int randomNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guessEditText = (EditText) findViewById(R.id.guessEditText);
        guessButton = (Button) findViewById(R.id.guessButton);

        randomNumber = random.nextInt(20) + 1;
    }

    public void guess(View view) {
        int guessedNumber = Integer.parseInt(guessEditText.getText().toString());

        if (guessedNumber < randomNumber) {
            Toast.makeText(this, R.string.guess_lower, Toast.LENGTH_SHORT).show();
        } else if (guessedNumber > randomNumber) {
            Toast.makeText(this, R.string.guess_higher, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, R.string.guess_correct, Toast.LENGTH_SHORT).show();
            guessButton.setEnabled(false);
        }
    }
}
