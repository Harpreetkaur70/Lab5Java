package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    four buttons to increase and decrease values
Button inc_a,inc_b,dec_a,dec_b,reset;
//four radio buttons to increase and dec values
RadioButton value_1,value_2,value_3,value_6;
//two textviews for team A and B scores
TextView score_a,score_b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        get widgets ids by using findviewbyid methods
        inc_a=findViewById(R.id.inc_a);
        inc_b=findViewById(R.id.inc_b);
        dec_a=findViewById(R.id.dec_a);
        dec_b=findViewById(R.id.dec_b);
        reset=findViewById(R.id.reset);
        value_1=findViewById(R.id.radio_1);
        value_2=findViewById(R.id.radio_2);
        value_3=findViewById(R.id.radio_3);
        value_6=findViewById(R.id.radio_6);
        score_a=findViewById(R.id.score_a);
        score_b=findViewById(R.id.score_b);

//        implements OnClickListener interface with class name & to apply click listener on buttons set click listener on buttons
        inc_a.setOnClickListener(this);
        inc_b.setOnClickListener(this);
        dec_a.setOnClickListener(this);
        dec_b.setOnClickListener(this);


//        set Click listener on reset button
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           score_a.setText("");
           score_b.setText("");
            }
        });
    }

    //onClick method is the predefined method of Onclicklistener interface or event
    @Override
    public void onClick(View v) {
        //getting scores from both textviews and store into string variables
        String score_team_a= score_a.getText().toString();
        String score_team_b=score_b.getText().toString();
        int val=0,val2=0;
        try {
            //convert string values to integer and save into two variables val and val2
             val = Integer.parseInt(score_team_a);
             val2=Integer.parseInt(score_team_b);
        }catch (NumberFormatException ex){

        }
//if condition check which radio button is selected

        if(value_1.isChecked()){
            //if first radiobutton is checked it will increase or decrease  value by one according to the clciked button of team
            if(v.getId()==R.id.inc_a){
                score_team_a=String.valueOf(val+1);
            }else if(v.getId()==R.id.inc_b){
                score_team_b=String.valueOf(val2+1);
            }else if(v.getId()==R.id.dec_a){
                score_team_a=String.valueOf(val-1);
            }else {
                score_team_b=String.valueOf(val2-1);
            }
        }else if(value_2.isChecked()){
            //if second radiobutton is checked it will increase or decrease  value by two according to the clciked button of team
            if(v.getId()==R.id.inc_a){
                score_team_a=String.valueOf(val+2);
            }else if(v.getId()==R.id.inc_b){
                score_team_b=String.valueOf(val2+2);
            }else if(v.getId()==R.id.dec_a){
                score_team_a=String.valueOf(val-2);
            }else {
                score_team_b=String.valueOf(val2-2);
            }
        }else if(value_3.isChecked()){
            //if third radiobutton is checked it will increase or decrease  value by three according to the clciked button of team
            if(v.getId()==R.id.inc_a){
                score_team_a=String.valueOf(val+3);
            }else if(v.getId()==R.id.inc_b){
                score_team_b=String.valueOf(val2+3);
            }else if(v.getId()==R.id.dec_a){
                score_team_a=String.valueOf(val-3);
            }else {
                score_team_b=String.valueOf(val2-3);
            }
        }else if(value_6.isChecked()){
            //if fourth radiobutton is checked it will increase or decrease  value by six according to the clciked button of team
            if(v.getId()==R.id.inc_a){
                score_team_a=String.valueOf(val+6);
            }else if(v.getId()==R.id.inc_b){
                score_team_b=String.valueOf(val2+6);
            }else if(v.getId()==R.id.dec_a){
                score_team_a=String.valueOf(val-6);
            }else {
                score_team_b=String.valueOf(val2-6);
            }
        }

        // in the end final scores will be displayed in the text views
        score_a.setText(score_team_a);
        score_b.setText(score_team_b);


    }
}