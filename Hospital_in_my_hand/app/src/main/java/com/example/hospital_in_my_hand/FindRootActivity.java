package com.example.hospital_in_my_hand;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FindRootActivity extends AppCompatActivity {
    Button f1_16_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findroot);
        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };
        f1_16_btn.setOnClickListener(onClickListener);

    }
}
