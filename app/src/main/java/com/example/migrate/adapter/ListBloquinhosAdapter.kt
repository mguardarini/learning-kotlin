package com.example.migrate.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.migrate.R
import com.example.migrate.extension.formatoBrasileiro
import com.example.migrate.model.Blocos
import kotlinx.android.synthetic.main.bloquinho_item.view.*

class ListBloquinhosAdapter(
    blocosCarnaval: List<Blocos>,
    context: Context) : BaseAdapter() {

    private val blocosCarnaval = blocosCarnaval;
    private val context = context;

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var viewCriada = LayoutInflater.from(context).inflate(R.layout.bloquinho_item,parent,false);
        var blocos = blocosCarnaval[position];

        viewCriada.bloco_valor.text = blocos.valor.toString();
        viewCriada.bloco_categoria.text = blocos.categoria;
        viewCriada.bloco_data.text = blocos.date.formatoBrasileiro();

        return viewCriada;
    }

    override fun getItem(position: Int): Blocos {
        return blocosCarnaval[position];
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }

    override fun getCount(): Int {
        return blocosCarnaval.size;
    }

}