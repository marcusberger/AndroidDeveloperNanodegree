package com.marcusberger.myportfolioapp;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button btnMessage = (Button) findViewById(R.id.Btn1);
        btnMessage.setOnClickListener(btn1);

        Button btnMessage2 = (Button) findViewById(R.id.Btn2);
        btnMessage2.setOnClickListener(btn2);

        Button btnMessage3 = (Button) findViewById(R.id.Btn3);
        btnMessage3.setOnClickListener(btn3);

        Button btnMessage4 = (Button) findViewById(R.id.Btn4);
        btnMessage4.setOnClickListener(btn4);

        Button btnMessage5 = (Button) findViewById(R.id.Btn5);
        btnMessage5.setOnClickListener(btn5);

        Button btnMessage6 = (Button) findViewById(R.id.Btn6);
        btnMessage6.setOnClickListener(btn6);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        }
        private View.OnClickListener btn1 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Toast.makeText(MainActivity.this, "This button will launch my popular movie app",
                       Toast.LENGTH_LONG).show();

            }
        };

    private View.OnClickListener btn2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "This button will launch my stock hawk app",
                    Toast.LENGTH_SHORT).show();

        }
    };

    private View.OnClickListener btn3 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "This button will launch my build it bigger app",
                    Toast.LENGTH_SHORT).show();

        }
    };

    private View.OnClickListener btn4 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "This button will launch my make your app material app",
                    Toast.LENGTH_SHORT).show();

        }
    };

    private View.OnClickListener btn5 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "This button will launch my go ubiquitous app",
                    Toast.LENGTH_SHORT).show();

        }
    };

    private View.OnClickListener btn6 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "This button will launch my capstone app",
                    Toast.LENGTH_SHORT).show();

        }
    };
}
