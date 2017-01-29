package com.diary.diary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button  zadanie=(Button)findViewById(R.id.Bt);
        Button  zdjecie=(Button)findViewById(R.id.Zdj);

        zadanie.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent int1= new Intent(MainActivity.this,Post.class);
                startActivity(int1);
            }
        });

        zdjecie.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent int2= new Intent(MainActivity.this,Photo.class);
                startActivity(int2);
            }
        });
    }

}
