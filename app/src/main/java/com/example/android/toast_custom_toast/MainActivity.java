package com.example.android.toast_custom_toast;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Button toast, customToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //get the button
        toast = (Button)findViewById(R.id.toast);
        customToast = (Button)findViewById(R.id.customToast);
        //on click lisenet

toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(getApplicationContext(), "just toast message", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0,0);
                toast.show();
            }
        });

        //set on click to custom toast
        customToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //the layout inflater and inflate the layout from xml
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.custom_toast_layout,(ViewGroup)findViewById(R.id.toast_layout_root));

                //get the text view, nad image view inflater
                TextView text =(TextView) layout.findViewById(R.id.text);
                ImageView image = (ImageView)findViewById(R.id.image);

                //set text view in text
                text.setText("Custom text View");

                //set image view
              //  image.setImageResource(R.drawable.androidicon);
                Toast toast = new Toast(getApplication());
                toast.setDuration(Toast.LENGTH_LONG);
                toast.setView(layout);
                toast.show();
            }
        });


    }
}
