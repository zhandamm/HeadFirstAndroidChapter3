package com.example.mymessenger;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_message);
        TextView textView = findViewById(R.id.text_message);
        Intent intent = getIntent();
        String messageText = intent.getStringExtra(EXTRA_MESSAGE);
        textView.setText(messageText);
    }

   /* public void onReceive(View view) {
        TextView textView = findViewById(R.id.text_message);
        Bundle arguments = getIntent().getExtras();
        textView.setText(arguments.get("message").toString());
    }*/
}