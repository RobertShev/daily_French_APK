package com.example.dailyfrench;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    String language = "French";
    String[] estonianArray = new String[]{"Koer","Jänes","Lieblikas","Maja","Elu","Tagasi"};
    String[] englishArray = new String[]{"Dog","Rabbit","Butterfly","House","Life","back"};
    String[] frenchArray = new String[]{"Chien","Lapin","Papillon","Maison","La vie","Retour"};

    int arrayIndex = 0;

    TextView wordView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setWord();
    }

    public void setWord(){
        wordView = (TextView) findViewById(R.id.wordView);

        Random r = new Random();
        int num = r.nextInt(5-0);

        arrayIndex = num;

        String wordToUse = "";

        if(language.equals("Estonian")){
            wordToUse = estonianArray[num];
        }else if(language.equals("English")){
            wordToUse = englishArray[num];
        }else{
            wordToUse = frenchArray[num];
        }

        wordView.setText(wordToUse);
    }

    public void onEstonianClick(View v){
        Button btn = (Button) findViewById(R.id.ButtonEstonian);
        language = "Estonian";
        wordView.setText(estonianArray[arrayIndex]);
    }

    public void onEnglishClick(View v){
        Button btn = (Button) findViewById(R.id.ButtonEnglish);
        language = "English";
        wordView.setText(englishArray[arrayIndex]);
    }

    public void onFrenchClick(View v){
        Button btn = (Button) findViewById(R.id.ButtonFrench);
        language = "French";
        wordView.setText(frenchArray[arrayIndex]);
    }

    public void onGoClick(View v){
        setWord();
    }
}
