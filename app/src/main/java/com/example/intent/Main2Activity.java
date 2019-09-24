package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.editText2);

        String response=getIntent().getStringExtra("message");
        textView.setText(response);
    }

    public void send(View view) {
        String reply=editText.getText().toString();
        Intent intent = new Intent();
        intent.putExtra("Reply",reply);
        setResult(RESULT_OK,intent);
        finish();
    }
}
