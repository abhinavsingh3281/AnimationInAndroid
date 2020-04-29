package com.example.animationinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.concurrent.Delayed;

public class MainActivity extends AppCompatActivity {
    private TextView txtHelloWorld;
    private TextView txtHiWorld;
    private boolean isHelloWorldShowing;
    private TextView txtAndroid;
    private Button btnAnimate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtHelloWorld=findViewById(R.id.txtHelloWorld);
        txtHiWorld=findViewById(R.id.txtHiWorld);
        txtAndroid=findViewById(R.id.txtAndroid);
        btnAnimate=findViewById(R.id.btnAnimate);



        txtHelloWorld.setX(2000);
        txtHiWorld.setX(-2000);
        txtAndroid.setY(-3000);

        txtHelloWorld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("TAG","This is hello button");

//                txtHelloWorld.animate().alpha(0).setDuration(1000);
//                txtHiWorld.animate().alpha(1).setDuration(1000);



                if (isHelloWorldShowing){
                    txtHelloWorld.animate().alpha(0).setDuration(3000);
                    txtHiWorld.animate().alpha(1).setDuration(3000);
                    isHelloWorldShowing=false;
                }
                else if (!isHelloWorldShowing){

                    txtHiWorld.animate().alpha(0).setDuration(3000);
                    txtHelloWorld.animate().alpha(1).setDuration(3000);
                    isHelloWorldShowing=true;

                }


            }
        });


        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                txtAndroid.animate().translationYBy(300).setDuration(3000);
////                txtAndroid.animate().rotation(360).setDuration(3000);

//                txtAndroid.animate().rotationBy(30).setDuration(3000);

//
//                txtAndroid.animate().rotationX(400).translationY(200).setDuration(3000);


                txtAndroid.animate().scaleX(0.2f).scaleY(0.4f).setDuration(3000);
            }
        });

        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtHelloWorld.animate().translationXBy(-2000).setDuration(3000);
                txtHiWorld.animate().rotation(720).translationXBy(2000).setDuration(3000);
                txtAndroid.animate().rotation(720).translationYBy(3000).alpha(0.7f).setDuration(3000);

            }
        });
    }
}
