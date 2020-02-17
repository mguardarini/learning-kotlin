package com.example.migrate.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.migrate.R
import com.example.migrate.model.Blocos

class ListBloquinhosAdapter(
    blocosCarnaval: List<Blocos>,
    context: Context) : BaseAdapter() {

    private val blocosCarnaval = blocosCarnaval;
    private val context = context;

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        return LayoutInflater.from(context).inflate(R.layout.bloquinho_item,parent,false);
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