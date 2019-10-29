package com.e.homestool;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A placeholder fragment containing a simple view.
 */
public class MyListFragment extends AppCompatActivity {
/*
    public MyListFragment() {
    }*/

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_my_list);

        ListView listView = (ListView) findViewById(R.id.listView);

        SingerAdapter adapter = new SingerAdapter();
/*
        adapter.addItem(new Sigeritem("소녀시대","010-1000-1000"));
        adapter.addItem(new Sigeritem("ㅇㄴㅁㅇㄴ","010-1123000-1000"));
        adapter.addItem(new Sigeritem("ㅇㅁㄴ","010-100320-1000"));
        adapter.addItem(new Sigeritem("ㅈㄷㄷ","010-100320-1000"));
        adapter.addItem(new Sigeritem("ㅇㅇㅇㅇ","010-231000-1000"));*/
        listView.setAdapter(adapter);
    }
    class SingerAdapter extends BaseAdapter {

        ArrayList<Sigeritem> items = new ArrayList<Sigeritem>();

        public void addItem(Sigeritem item){
            items.add(item);

        }
        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int i) {
            return items.get(i);
        }

        @Override
        public long getItemId(int i) {
            return i;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            SigeritemView views = new SigeritemView(getApplicationContext());

            Sigeritem item = items.get(i);

            views.setImageView(item.getResId());
            views.setName(item.getName());
            views.setPhone(item.getMoblie());

            return views;
        }
    }
    /*  @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_my_list, container, false);
    }*/
}
