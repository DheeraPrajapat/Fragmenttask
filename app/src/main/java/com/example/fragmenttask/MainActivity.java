package com.example.fragmenttask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton microphone,video,action;
    BottomNavigationView bottomNavigationView;
    String floatButton="hidden";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewS();
        action.setOnClickListener(v->{
                if(floatButton.equals("hidden")){
                    microphone.setVisibility(View.VISIBLE);
                    video.setVisibility(View.VISIBLE);
                    action.setImageResource(R.drawable.close);
                    floatButton="show";
                }else if(floatButton.equals("show")){
                    microphone.setVisibility(View.GONE);
                    video.setVisibility(View.GONE);
                    action.setImageResource(R.drawable.add);
                    floatButton="hidden";
                }
        });
        bottomNavigationView.setOnItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                return false;
            }
        });
    }

    private void initViewS() {
        microphone=findViewById(R.id.microPhoneFloatingButton);
        video=findViewById(R.id.videoFloatingButton);
        action=findViewById(R.id.actionFloatingButton);
        bottomNavigationView=findViewById(R.id.bottomNavigation);
    }

    @Override
    protected void onStart() {
        super.onStart();
        video.setVisibility(View.GONE);
        microphone.setVisibility(View.GONE);
    }
}