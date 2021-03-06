package com.example.uts.kategori;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.uts.R;

public class KategoriActivity extends AppCompatActivity {
    ListView listView;
    KategoriAdapter adapter;
    Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kategori);
        listView = findViewById(R.id.listView);
        adapter = new KategoriAdapter(this, R.layout.item_list_view);
        listView.setAdapter(adapter);
        res = getResources();


        initData();
    }


    void initData() {
        String[] judul = res.getStringArray(R.array.judul);
        String[] outlet = res.getStringArray(R.array.outlet);
        String[] deskripsi = res.getStringArray(R.array.deskripsi);
        String[] imageURL = res.getStringArray(R.array.imageURL);

        for (int i = 0; i < judul.length; i++) {
            Kategori model = new Kategori();
            model.setTitle(judul[i]);
            model.setOutlet(outlet[i]);
            model.setDeskripsi(deskripsi[i]);
            model.setImageURL(imageURL[i]);
            adapter.add(model);
        }
        adapter.notifyDataSetChanged();
    }
}