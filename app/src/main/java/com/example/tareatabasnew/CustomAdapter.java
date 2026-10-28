package com.example.tareatabasnew;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

    public class CustomAdapter extends BaseAdapter {

        private Context context;
        private List<Elemento> listaElementos;
        private int layoutId;

        // Constructor que recibe el contexto, la lista de datos y el xml
        public CustomAdapter(Context context, List<Elemento> listaElementos, int layoutId) {
            this.context = context;
            this.listaElementos = listaElementos;
            this.layoutId = layoutId;
        }

        @Override
        public int getCount() {
            return listaElementos.size();
        }

        @Override
        public Object getItem(int position) {
            return listaElementos.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ViewHolder holder;

            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(layoutId, parent, false);
                holder = new ViewHolder();
                holder.imgItem = convertView.findViewById(R.id.imgItem);
                holder.txtTitle = convertView.findViewById(R.id.txtItemTitle);
                convertView.setTag(holder);
            } else {
                holder = (ViewHolder) convertView.getTag();
            }

            Elemento item = listaElementos.get(position);
            holder.txtTitle.setText(item.getNombre());
            holder.imgItem.setImageResource(item.getImagenResId());

            return convertView;
        }

        static class ViewHolder {
            ImageView imgItem;
            TextView txtTitle;
        }
    }
