package com.example.shrivastava.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    // Global Variables for both teams
    int goalCountTeamA;
    int goalCountTeamB;
    int foulCountTeamA;
    int foulCountTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goalTeamA(View v){
        goalCountTeamA+=1;
        updateGoalTeamA(goalCountTeamA);
    }

    public void goalTeamB(View v){
        goalCountTeamB+=1;
        updateGoalTeamB(goalCountTeamB);
    }

    public void foulTeamA(View v){
        foulCountTeamA+=1;
        updateFoulTeamA(foulCountTeamA);
    }

    public void foulTeamB(View v){
        foulCountTeamB+=1;
        updateFoulTeamB(foulCountTeamB);
    }

    public void reset(View v){
        foulCountTeamB=0;
        foulCountTeamA=0;
        goalCountTeamB=0;
        goalCountTeamA=0;
        updateGoalTeamA(goalCountTeamA);
        updateGoalTeamB(goalCountTeamB);
        updateFoulTeamA(foulCountTeamA);
        updateFoulTeamB(foulCountTeamB);
    }

    //Update Goal Score for Team A
    public void updateGoalTeamA(int goal){
        TextView goalcount = (TextView) findViewById(R.id.score_team_a);
        goalcount.setText(String.valueOf(goal));
    }

    //Update Foul for Team A
    public void updateGoalTeamB(int goal){
        TextView goalcount = (TextView) findViewById(R.id.score_team_b);
        goalcount.setText(String.valueOf(goal));
    }

    //Update Goal Score for Team B
    public  void updateFoulTeamA(int foul){
        TextView foulCount = (TextView) findViewById(R.id.foul_team_a);
        foulCount.setText(String.valueOf(foul));
    }

    //Update Foul for Team B
    public  void updateFoulTeamB(int foul){
        TextView foulCount = (TextView) findViewById(R.id.foul_team_b);
        foulCount.setText(String.valueOf(foul));
    }
}
