package com.example.guillermo.recyclerview_cardview_lab16;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by guillermo on 26/02/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ListaViewHolder> {
    String[][] datos;

    public Adapter(String[][] datos) {
        this.datos = datos;
    }

    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        ListaViewHolder listaViewHolder=new ListaViewHolder(view);
        return listaViewHolder;
    }

    @Override
    public void onBindViewHolder(ListaViewHolder holder, int position) {
        holder.txtNombre.setText(datos[position][0]);
        holder.txtDescripcion.setText(datos[position][1]);

    }

    @Override
    public int getItemCount() {
        return datos.length;
    }

    public class ListaViewHolder extends RecyclerView.ViewHolder{
        ImageView imagen;
        TextView txtNombre,txtDescripcion;
        public ListaViewHolder(View itemView) {
            super(itemView);
            String[] colores={"#f42909","#0aa3fc","#9b42f4","#f47a42","#55a548"};
            itemView.setBackgroundColor(Color.parseColor(colores[(int)(new Random().nextInt(5))]));
            imagen=itemView.findViewById(R.id.imagen);
            txtNombre=itemView.findViewById(R.id.txtNombre);
            txtDescripcion=itemView.findViewById(R.id.txtDescripcion);
        }
    }
}
