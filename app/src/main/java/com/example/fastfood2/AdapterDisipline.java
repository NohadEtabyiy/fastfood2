package com.example.fastfood2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class AdapterDisipline extends ArrayAdapter<Disipline> {
    List<Disipline> ListDisiplinee;
    Context context;
    int resource;
    public AdapterDisipline(Context context, int resource, List<Disipline> DisiplineList) {
        super(context, resource, DisiplineList);
        this.context = context;
        this.resource = resource;
        this.ListDisiplinee = DisiplineList;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);

        View view = layoutInflater.inflate(resource, null, false);

        TextView textView = view.findViewById(R.id.TextView1);
        TextView textobsirvation = view.findViewById(R.id.TextView2);
        TextView textgerie = view.findViewById(R.id.TextView3);
        TextView textconseil = view.findViewById(R.id.TextView4);

        Disipline Dis = ListDisiplinee.get(position);


        textView.setText(Dis.getdate());
        textobsirvation.setText(Dis.getobsirvation());
        textgerie.setText(Dis.getgerie());
        textconseil.setText(Dis.getConseil());

        return view;
    }

}