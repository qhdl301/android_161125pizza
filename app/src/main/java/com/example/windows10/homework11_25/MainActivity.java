package com.example.windows10.homework11_25;

import android.media.Image;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tv1;
    EditText et1,et2,et3,et4,et5;
    CheckBox cb1;
    RadioGroup rbg1;
    RadioButton rb1,rb2;
    Button bt1;
    ImageView iv1;
    Image pikul,sosu;
    int num1,num2,num3,sum1,sum2;
    double avg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv1=(TextView)findViewById(R.id.textView17);
        et1=(EditText)findViewById(R.id.editText9);
        et2=(EditText)findViewById(R.id.editText8);
        et3=(EditText)findViewById(R.id.editText10);
        et4=(EditText)findViewById(R.id.editText11);
        et5=(EditText)findViewById(R.id.editText12);
        cb1=(CheckBox)findViewById(R.id.checkBox2);
        rbg1=(RadioGroup)findViewById(R.id.radioGroup);
        rb1=(RadioButton)findViewById(R.id.radioButton10);
        rb2=(RadioButton)findViewById(R.id.radioButton11);
        bt1=(Button)findViewById(R.id.button);
        iv1=(ImageView)findViewById(R.id.imageView);



        bt1.setOnClickListener(new Button.OnClickListener() {
            @Override

            public void onClick(View view) {
                num1= Integer.parseInt(et1.getText().toString());
                num2= Integer.parseInt(et2.getText().toString());
                num3= Integer.parseInt(et3.getText().toString());
                sum1 = num1+num2+num3;
                sum2= (num1*16000)+(num2*11000)+(num3*4000);
                et4.setText(Integer.toString(sum1));
                et5.setText(Integer.toString(sum2));

                        if(rb1.isChecked()){
                            Toast.makeText(getApplicationContext(), "피클을 선택하셨습니다.", Toast.LENGTH_SHORT).show();
                            iv1.setImageResource(R.drawable.pikul);
                        }
                        else if(rb2.isChecked()) {
                            Toast.makeText(getApplicationContext(), "소스를 선택하셨습니다.", Toast.LENGTH_SHORT).show();
                            iv1.setImageResource(R.drawable.sosu);
                        }

                if(cb1.isChecked()){
                    avg=sum2*0.93;
                    et5.setText(String.format("%.2f",avg));
                }
            }
        });
    }
}
