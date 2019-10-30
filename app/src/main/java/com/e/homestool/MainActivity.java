package com.e.homestool;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Toolbar;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Fragmentcallback {
    Intent intent;
    toolFragment toolFragment;
    electtoolFragment electtoolFragment;
    cuttoolFragment cuttoolFragment;
    airtoolFragment airtoolFragment;

    Toolbar toolbar;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) { switch (item.getItemId()) {
                case R.id.navigation_home:
                        return true;
                case R.id.navigation_dashboard:
                        return true;
                case R.id.navigation_notifications:
                        return true;
                }
                return false;
            }
        };

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            int curid = item.getItemId();
            switch (curid){
                    case R.id.menu_setting:
                    Toast.makeText(this,"설정메뉴클릭댐",Toast.LENGTH_LONG).show();
                    break;
                default:
                    break;
            }
            return super.onOptionsItemSelected(item);
        }

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            getMenuInflater().inflate(R.menu.menu_main,menu);
            return true;
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.guide_list);

            BottomNavigationView navView = findViewById(R.id.nav_view);
            //navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

            //actionBar abar = getSupportActionBar();
            //abar.hide();
            // = (Toolbar) findViewById(R.id.toolbar);
            //setSupportActionBar(toolbar);//

            toolFragment = new toolFragment();
            electtoolFragment = new electtoolFragment();
            cuttoolFragment = new cuttoolFragment();
            airtoolFragment = new airtoolFragment();

            // 프래그먼트수정
/*

            Intent intent = new Intent(getApplicationContext(), MyListFragment.class);
            startActivity(intent);
            finish();
*/


            TabLayout tabs = (TabLayout) findViewById(R.id.tabs);
            tabs.addTab(tabs.newTab().setText("수공구"));
            tabs.addTab(tabs.newTab().setText("전동공구"));
            tabs.addTab(tabs.newTab().setText("절단공구"));
            tabs.addTab(tabs.newTab().setText("에어공구"));

            getSupportFragmentManager().beginTransaction().add(R.id.container, toolFragment).commit();
            TabLayout.Tab tab = tabs.getTabAt(0);
            tab.select();
            tabs.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
                @Override
                public void onTabUnselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabReselected(TabLayout.Tab tab) {

                }

                @Override
                public void onTabSelected(TabLayout.Tab tab) {
                    int position = tab.getPosition();
                    Fragment selected = null;
                    if (position == 0) selected = toolFragment;
                    else if (position == 1) selected = electtoolFragment;
                    else if (position == 2) selected = cuttoolFragment;
                    else if (position == 3) selected = airtoolFragment;
                    getSupportFragmentManager().beginTransaction().replace(R.id.container, selected).commit();
                }
            });
        }

    @Override
    public void onFragmentSelected(int position, Bundle bundle) {
        Fragment curFragment = null;

        if(position == 0){

            curFragment = airtoolFragment;

        } else if (position ==1){

            curFragment = cuttoolFragment;
        }else if (position ==2){

            curFragment = toolFragment;
        }

        getSupportFragmentManager().beginTransaction().replace(R.id.contianer2,curFragment).commit();
    }
}
