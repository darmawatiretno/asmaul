package com.excample.retno.asmaulhusna;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/** * Created by ammarkhasali on 2/19/2018 AD. */
class AsmaulAdapter extends BaseAdapter {
    private Context mContext;
    private String[] indohusna;
    private String[] arabhusna;
    public AsmaulAdapter(MainActivity mainActivity, String[] indohusna, String[] arabhusna) {
        this.arabhusna = arabhusna;
        this.indohusna = indohusna;
        mContext = mainActivity;

    }

    @Override    public int getCount() {
        return arabhusna.length;
    }

    @Override    public Object getItem(int position) {
        return null;
    }

    @Override    public long getItemId(int position) {
        return 0;
    }

    @Override    public View getView(int position, View convertView, ViewGroup parent) {
        View tampilan =LayoutInflater.from(mContext).inflate(R.layout.layoutitem,null);
        TextView txtarab = (TextView) tampilan.findViewById(R.id.txtarab);
        TextView txtindo = (TextView) tampilan.findViewById(R.id.txtindo);
        txtarab.setText(arabhusna[position]);
        txtindo.setText(indohusna[position]);
        return tampilan;
    }
}

