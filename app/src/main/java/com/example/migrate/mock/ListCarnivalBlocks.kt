package com.example.migrate.mock

import com.example.migrate.model.CarnivalBlocksModel
import com.example.migrate.model.Tipo
import java.math.BigDecimal
import java.util.*

fun MockCarnivalBlocks() : List<CarnivalBlocksModel> {

    return listOf(
        CarnivalBlocksModel(
            price = "200.0",
            date = Calendar.getInstance(),
            type = Tipo.LGBTQ,
            name = "Minhoqueens"),
        CarnivalBlocksModel(
            price = "120.3",
            date = Calendar.getInstance(),
            type = Tipo.LGBTQ,
            name = "Bloco Pablo"),
        CarnivalBlocksModel(
            price = "125.7",
            date = Calendar.getInstance(),
            type = Tipo.ALTERNATIVO,
            name = "Bloco do Alok")
    );
}