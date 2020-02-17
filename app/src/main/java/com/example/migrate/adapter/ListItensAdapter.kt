package com.example.migrate.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.example.migrate.R

class ListItensAdapter(
    bloquinhos: List<String>,
    context: Context) : BaseAdapter() {

    private val bloquinhos = bloquinhos;
    private val context = context;

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        return LayoutInflater.from(context).inflate(R.layout.bloquinho_item,parent,false);
    }

    override fun getItem(position: Int): String {
        return bloquinhos[position];
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }

    override fun getCount(): Int {
        return bloquinhos.size;
    }
}