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
import com.example.migrate.extension.CaracteresLimitAt
import com.example.migrate.model.CarnivalBlockModel
import com.example.migrate.model.CarnivalBlockType
import kotlinx.android.synthetic.main.bloquinho_item.view.*

class CarnivalBlocksAdapter(
    private val carnivalBlockList: List<CarnivalBlockModel>,
    private val context: Context) : BaseAdapter() {

    override fun getView(position: Int, view: View?, parent: ViewGroup?): View {

        var viewCarnivalBlocks  = LayoutInflater.from(context).inflate(R.layout.bloquinho_item,parent,false);
        var carnivalBlockItem = carnivalBlockList[position];

        AddName(position, viewCarnivalBlocks, carnivalBlockItem)
        AddPrice(viewCarnivalBlocks, carnivalBlockItem)
        AddDate(viewCarnivalBlocks, carnivalBlockItem)

        return viewCarnivalBlocks;
    }

    private fun AddDate(
        viewCarnivalBlocks: View,
        blocos: CarnivalBlockModel
    ) {
        viewCarnivalBlocks.bloco_data.text = blocos.date.BrazilianDateFormat();
    }

    private fun AddPrice(
        viewCarnivalBlocks: View,
        blocos: CarnivalBlockModel
    ) {
        viewCarnivalBlocks.bloco_price.text = blocos.price.BrazilianPriceFormat();
    }

    private fun AddName(
        position: Int,
        viewCarnivalBlocks: View,
        blocos: CarnivalBlockModel
    ) {
        var carnivalBlock = carnivalBlockList[position];
        var color: Int = ColorType(carnivalBlock)

        viewCarnivalBlocks.bloco_nome.text = blocos.name.CaracteresLimitAt(14);
        viewCarnivalBlocks.bloco_nome.setTextColor(color)
    }

    private fun ColorType(carnivalBlock: CarnivalBlockModel): Int {
        return if (carnivalBlock.type == CarnivalBlockType.LGBTQ)
            ContextCompat.getColor(
                context,
                R.color.colorPrimary
            )
        else
            ContextCompat.getColor(
                context,
                R.color.design_default_color_primary_dark
            )
    }

    override fun getItem(position: Int): CarnivalBlockModel {
        return carnivalBlockList[position];
    }

    override fun getItemId(position: Int): Long {
        return 0;
    }

    override fun getCount(): Int {
        return carnivalBlockList.size;
    }

}