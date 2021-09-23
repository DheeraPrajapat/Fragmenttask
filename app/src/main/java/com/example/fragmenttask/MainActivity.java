package com.example.fragmenttask;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;

import com.example.fragmenttask.Fragments.Album_Fragment;
import com.example.fragmenttask.Fragments.Drive_Fragment;
import com.example.fragmenttask.Fragments.Group_Fragment;
import com.example.fragmenttask.Fragments.Home_Fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton microphone,video,action;
    BottomNavigationView bottomNavigationView;
    String floatButton="hidden";
    FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewS();
        loadFragment(new Home_Fragment());
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
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item)
            {
                Fragment fragment=null;
                switch (item.getItemId())
                {
                    case R.id.homeIcon:
                        fragment=new Home_Fragment();
                        break;
                    case R.id.groupIcon:
                        fragment=new Group_Fragment();
                        break;
                    case R.id.albumIcon:
                        fragment=new Album_Fragment();
                        break;
                    case R.id.driveIcon:
                        fragment=new Drive_Fragment();
                        break;
                }
                return loadFragment(fragment);
            }
        });
    }

    private boolean loadFragment(Fragment fragment) {
        //switching fragment
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.frameLayout, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    private void initViewS() {
        microphone=findViewById(R.id.microPhoneFloatingButton);
        video=findViewById(R.id.videoFloatingButton);
        action=findViewById(R.id.actionFloatingButton);
        bottomNavigationView=findViewById(R.id.bottomNavigation);
        frameLayout=findViewById(R.id.frameLayout);
    }

    @Override
    protected void onStart() {
        super.onStart();
        video.setVisibility(View.GONE);
        microphone.setVisibility(View.GONE);
    }
}