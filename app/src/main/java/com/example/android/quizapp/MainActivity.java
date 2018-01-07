package com.example.android.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /**
     * This block of line declares and initiates variables.
     * variable points will count the points, 10 points for each correct answer
     * the other variables represents the answer variables
     */
    int points = 0;

    /**
     * variables for question 1 answers
     */
    CheckBox ifCheckedQ1A1;
    CheckBox ifCheckedQ1A2;
    CheckBox ifCheckedQ1A3;
    CheckBox ifCheckedQ1A4;

    /**
     * variable for question 2 answer
     */
    EditText questionTwo;

    /**
     * variables for question 3 answers
     */
    RadioButton ifCheckedQ3A1;
    RadioButton ifCheckedQ3A2;
    RadioButton ifCheckedQ3A3;
    RadioButton ifCheckedQ3A4;

    /**
     * variables for question 4 answers
     */
    RadioButton ifCheckedQ4A1;
    RadioButton ifCheckedQ4A2;
    RadioButton ifCheckedQ4A3;
    RadioButton ifCheckedQ4A4;

    /**
     * variable for question 5 answer
     */
    EditText questionFive;

    /**
     * variables for question 6 answers
     */
    RadioButton ifCheckedQ6A1;
    RadioButton ifCheckedQ6A2;
    RadioButton ifCheckedQ6A3;
    RadioButton ifCheckedQ6A4;

    /**
     * variables for question 7 answers
     */
    RadioButton ifCheckedQ7A1;
    RadioButton ifCheckedQ7A2;

    /**
     * variables for question 8 answers
     */
    RadioButton ifCheckedQ8A1;
    RadioButton ifCheckedQ8A2;
    RadioButton ifCheckedQ8A3;
    RadioButton ifCheckedQ8A4;

    /**
     * variables for question 9 answers
     */
    RadioButton ifCheckedQ9A1;
    RadioButton ifCheckedQ9A2;

    /**
     * variables for question 10 answers
     */
    CheckBox ifCheckedQ10A1;
    CheckBox ifCheckedQ10A2;
    CheckBox ifCheckedQ10A3;
    CheckBox ifCheckedQ10A4;
    CheckBox ifCheckedQ10A5;
    CheckBox ifCheckedQ10A6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*
        This block of lines initiates instance variables for all the views.
        */
        ifCheckedQ1A1 = (CheckBox) findViewById(R.id.q1a1);
        ifCheckedQ1A2 = (CheckBox) findViewById(R.id.q1a2);
        ifCheckedQ1A3 = (CheckBox) findViewById(R.id.q1a3);
        ifCheckedQ1A4 = (CheckBox) findViewById(R.id.q1a4);

        questionTwo = (EditText) findViewById(R.id.q2a);

        ifCheckedQ3A1 = (RadioButton) findViewById(R.id.q3a1);
        ifCheckedQ3A2 = (RadioButton) findViewById(R.id.q3a2);
        ifCheckedQ3A3 = (RadioButton) findViewById(R.id.q3a3);
        ifCheckedQ3A4 = (RadioButton) findViewById(R.id.q3a4);

        ifCheckedQ4A1 = (RadioButton) findViewById(R.id.q4a1);
        ifCheckedQ4A2 = (RadioButton) findViewById(R.id.q4a2);
        ifCheckedQ4A3 = (RadioButton) findViewById(R.id.q4a3);
        ifCheckedQ4A4 = (RadioButton) findViewById(R.id.q4a4);

        questionFive = (EditText) findViewById(R.id.q5a);

        ifCheckedQ6A1 = (RadioButton) findViewById(R.id.q6a1);
        ifCheckedQ6A2 = (RadioButton) findViewById(R.id.q6a2);
        ifCheckedQ6A3 = (RadioButton) findViewById(R.id.q6a3);
        ifCheckedQ6A4 = (RadioButton) findViewById(R.id.q6a4);

        ifCheckedQ7A1 = (RadioButton) findViewById(R.id.q7a1);
        ifCheckedQ7A2 = (RadioButton) findViewById(R.id.q7a2);

        ifCheckedQ8A1 = (RadioButton) findViewById(R.id.q8a1);
        ifCheckedQ8A2 = (RadioButton) findViewById(R.id.q8a2);
        ifCheckedQ8A3 = (RadioButton) findViewById(R.id.q8a3);
        ifCheckedQ8A4 = (RadioButton) findViewById(R.id.q8a4);

        ifCheckedQ9A1 = (RadioButton) findViewById(R.id.q9a1);
        ifCheckedQ9A2 = (RadioButton) findViewById(R.id.q9a2);

        ifCheckedQ10A1 = (CheckBox) findViewById(R.id.q10a1);
        ifCheckedQ10A2 = (CheckBox) findViewById(R.id.q10a2);
        ifCheckedQ10A3 = (CheckBox) findViewById(R.id.q10a3);
        ifCheckedQ10A4 = (CheckBox) findViewById(R.id.q10a4);
        ifCheckedQ10A5 = (CheckBox) findViewById(R.id.q10a5);
        ifCheckedQ10A6 = (CheckBox) findViewById(R.id.q10a6);

    }

    /**
     * This method is called when the submit button is clicked.
     */
    public void submit(View view) {
        /*
          Question 1: This block of lines checks if the right answers are given (checkbox 1 and 3 are correct) and gives 10 points if so.
         */

        if (ifCheckedQ1A1.isChecked()) {
            if (ifCheckedQ1A2.isChecked()){
            } else if (ifCheckedQ1A3.isChecked()) {
            } else if (ifCheckedQ1A4.isChecked()) {
                points = points + 10;
                Log.v("MainActivity.java", "Question 1 correct");
            }
        }

        /*
          Question 2: This block of lines checks if the right answers is filled ("Black" is the right answer) and gives 10 points if so.
         */

        String questionTwoAnswer = questionTwo.getText().toString();
        /* String q2a = getString(R.string.q2a); */

        if (questionTwoAnswer.equals("Black")) {
            points = points + 10;
            Log.v("MainActivity.java", "Question 2 correct");
        }

        /*
          Question 3: This block of lines checks if the right answer is given (radio button 2 is correct) and gives 10 points if so.
         */

        if (ifCheckedQ3A2.isChecked()) {
            points = points + 10;
            Log.v("MainActivity.java", "Question 3 correct");
        }

        /*
          Question 4: This block of lines checks if the right answer is given (radio button 3 is correct) and gives 10 points if so.
         */

        if (ifCheckedQ4A3.isChecked()) {
            points = points + 10;
            Log.v("MainActivity.java", "Question 4 correct");
        }

        /*
          Question 5: This block of lines checks if the right answers is filled ("Black" is the right answer) and gives 10 points if so.
         */

        String questionFiveAnswer = questionFive.getText().toString();
        /* String q5a = getString(R.string.q5a); */

        if (questionFiveAnswer.equals("Dots Per Inch")) {
            points = points + 10;
            Log.v("MainActivity.java", "Question 5 correct");
        }

        /*
          Question 6: This block of lines checks if the right answer is given (radio button 2 is correct) and gives 10 points if so.
         */

        if (ifCheckedQ6A2.isChecked()) {
            points = points + 10;
            Log.v("MainActivity.java", "Question 6 correct");
        }

        /*
          Question 7: This block of lines checks if the right answer is given (radio button 2 is correct) and gives 10 points if so.
         */

        if (ifCheckedQ7A2.isChecked()) {
            points = points + 10;
            Log.v("MainActivity.java", "Question 7 correct");
        }

        /*
          Question 8: This block of lines checks if the right answer is given (radio button 3 is correct) and gives 10 points if so.
         */

        if (ifCheckedQ8A3.isChecked()) {
            points = points + 10;
            Log.v("MainActivity.java", "Question 8 correct");
        }

        /*
          Question 9: This block of lines checks if the right answer is given (radio button 1 is correct) and gives 10 points if so.
         */

        if (ifCheckedQ9A1.isChecked()) {
            points = points + 10;
            Log.v("MainActivity.java", "Question 9 correct");
        }

        /*
          Question 10: This block of lines checks if the right answers are given (all are correct) and gives 10 points if so.
         */

        if (ifCheckedQ10A1.isChecked()) {
            if (ifCheckedQ10A2.isChecked()){
                if (ifCheckedQ10A3.isChecked()){
                    if (ifCheckedQ10A4.isChecked()){
                        if (ifCheckedQ10A5.isChecked()){
                            if (ifCheckedQ10A6.isChecked()) {
                                points = points + 10;
                                Log.v("MainActivity.java", "Question 10 correct");
                            }
                        }
                    }
                }

            }
        }

        displayMessage();

    }

    /**
     * This method display a toast message with the result of the quiz
     */

    public void displayMessage(){
        String score = getString(R.string.score);
        String pointsText = getString(R.string.points);
        Context context = getApplicationContext();
        if (points <= 50) {

            /*
              score is low
             */
            String low = getString(R.string.low);
            CharSequence text = score + " " + points + " " + pointsText + " " + low;
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else if (points < 100) {

            /*
              score is medium
             */
            String medium = getString(R.string.medium);
            CharSequence text = score + " " + points + " " + pointsText + " " + medium;
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        } else {

            /*
              score is high
             */
            String high = getString(R.string.high);
            CharSequence text = score + " " + points + " " + pointsText + " " + high;
            int duration = Toast.LENGTH_SHORT;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }

        points = 0;

    }

}
