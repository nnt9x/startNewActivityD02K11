package com.bkacad.nnt.startnewactivityd02k11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnNext;
    private EditText edtContent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnNext = findViewById(R.id.btnNext);
        edtContent = findViewById(R.id.edtContent);

        // Sự kiện khi click vào buttonNext => chuyển Activity 2
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Chuyen sang Activity so 2
                String content = edtContent.getText().toString();
                if(content.isEmpty()){
                    edtContent.setError("Hãy nhập dữ liệu!");
                    return;
                }
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("key",content);
                startActivity(intent);
            }
        });

    }
}