
package com.aaiaero.emaintenance;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GAGAN extends AppCompatActivity {

    public void inres (View view){


        Intent intent = new Intent(getApplicationContext(),GAGANINRES.class);
        startActivity(intent);


    }

    public void inmcc (View view){


        Intent intent = new Intent(getApplicationContext(),DvorMopiensActivity.class);
        startActivity(intent);


    }

    public void inlus (View view){


        Intent intent = new Intent(getApplicationContext(),DVORASII1150.class);
        startActivity(intent);


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gagan);


    }
}