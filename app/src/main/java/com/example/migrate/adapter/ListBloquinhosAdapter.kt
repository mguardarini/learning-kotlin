package com.example.migrate.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import androidx.core.content.ContextCompat
import com.example.migrate.R
import com.example.migrate.extension.BrazilianPriceFormat
import com.example.migrate.extension.BrazilianDateFormat
import com.example.migrate.model.CarnivalBlocksModel
import com.example.migrate.model.Tipo
import kotlinx.android.synthetic.main.bloquinho_item.view.*

class ListBloquinhosAdapter(
    blocosCarnaval: List<CarnivalBlocksModel>,
    context: Context) : BaseAdapter() {

    private val blocosCarnaval = blocosCarnaval;
    private val context = context;

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {
        var viewCarnivalBlocks  = LayoutInflater.from(context).inflate(R.layout.bloquinho_item,parent,false);
        var blocos = blocosCarnaval[position];
        viewCarnivalBlocks.bloco_price.text = blocos.price.BrazilianPriceFormat();
        viewCarnivalBlocks.bloco_nome.text = blocos.name;
        viewCarnivalBlocks.bloco_data.text = blocos.date.BrazilianDateFormat();

        var bloco = blocosCarnaval[position];

        if(bloco.type == Tipo.LGBTQ)
            viewCarnivalBlocks.bloco_nome.setTextColor(ContextCompat.getColor(context,R.color.colorPrimary))
        else
            viewCarnivalBlocks.bloco_nome.setTextColor(ContextCompat.getColor(context,R.color.design_default_color_primary_dark))

        return viewCarnivalBlocks;
    }

    override fun getItem(position: Int): CarnivalBlocksModel {
        return blocosCarnaval[position];
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }

    override fun getCount(): Int {
        return blocosCarnaval.size;
    }

}