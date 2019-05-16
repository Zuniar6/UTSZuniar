package com.example.uts.kategori;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.uts.R;
import com.example.uts.restoran.RestoranActivity;
import com.example.uts.utils.AmbilGambar;

public class KategoriAdapter extends ArrayAdapter<Kategori> {

    Context context;
    int resource;

    public KategoriAdapter(Context context, int resource) {
        super(context, resource);
        this.context = context;
        this.resource = resource;
    }

    @RequiresApi(api = Build.VERSION_CODES.CUPCAKE)
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder = null;

        if (convertView == null) {
            holder = new Holder();
            convertView = LayoutInflater.from(context).inflate(resource, parent, false);
            holder.text_judul = convertView.findViewById(R.id.text_judul);
            holder.text_outlet = convertView.findViewById(R.id.text_outlet);
            holder.text_deskripsi = convertView.findViewById(R.id.text_deskripsi);
            holder.imageHeader = convertView.findViewById(R.id.imageHeader);
            holder.itemLayout = convertView.findViewById(R.id.itemLayout);
            convertView.setTag(holder);
        } else {
            holder = (Holder) convertView.getTag();
        }
        holder.text_judul.setText(getItem(position).getJudul());
        holder.text_outlet.setText(getItem(position).getOutlet());
        holder.text_deskripsi.setText(getItem(position).getDeskripsi());


        holder.itemLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, RestoranActivity.class);
                intent.putExtra("URL", getItem(position).getImageURL());
                context.startActivity(intent);
            }
        });
        new AmbilGambar(holder.imageHeader).execute(getItem(position).getImageURL());
        return convertView;
    }

    class Holder {
        TextView text_judul, text_outlet, text_deskripsi;
        ImageView imageHeader;
        RelativeLayout itemLayout;
    }
}