package com.example.migrate.mock

import com.example.migrate.model.CarnivalBlocksModel
import com.example.migrate.model.Tipo
import java.math.BigDecimal
import java.util.*

fun MockCarnivalBlocks() : List<CarnivalBlocksModel> {
    return listOf(
        CarnivalBlocksModel(
            quantityPeople = BigDecimal(200),
            date = Calendar.getInstance(),
            type = Tipo.LGBTQ,
            name = "Minhoqueens"),
        CarnivalBlocksModel(
            quantityPeople = BigDecimal(100),
            date = Calendar.getInstance(),
            type = Tipo.LGBTQ,
            name = "Bloco Pablo"),
        CarnivalBlocksModel(
            quantityPeople = BigDecimal(100),
            date = Calendar.getInstance(),
            type = Tipo.ALTERNATIVO,
            name = "Bloco do Alok")
    );
}