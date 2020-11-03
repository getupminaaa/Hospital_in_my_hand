package com.example.hospital_in_my_hand;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FindRootActivity extends AppCompatActivity {
    Button f1_16_btn,f1_4_btn,f1_1_btn,f1_18_btn,f1_15_btn,f1_19_btn,f1_7_btn,f1_6_btn,f1_20_btn,f1_lift_1_btn,f1_28_btn,f1_23_btn,f1_10_btn,f1_31_btn,f1_24_btn,f1_11_btn,f1_2_btn,f1_12_btn,f1_30_btn
            ,f1_29_btn,f1_cafe_btn;
    TextView setTitle,setRoomID,setCoordinateX,setCoordinateY,setFloorNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_findroot);


        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch(view.getId()) {
                    case R.id.f1_16_btn:
                        
                }
            }
        };
        f1_16_btn.setOnClickListener(onClickListener);
    }
}
