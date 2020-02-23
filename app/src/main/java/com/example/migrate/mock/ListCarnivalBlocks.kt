package com.example.migrate.mock

import com.example.migrate.model.CarnivalBlockModel
import com.example.migrate.model.CarnivalBlockType
import java.util.*

fun MockCarnivalBlocks() : List<CarnivalBlockModel> {

    return listOf(
        CarnivalBlockModel(
            price = "200.0",
            date = Calendar.getInstance(),
            type = CarnivalBlockType.LGBTQ,
            name = "Minhoqueens"),
        CarnivalBlockModel(
            price = "120.3",
            date = Calendar.getInstance(),
            type = CarnivalBlockType.LGBTQ,
            name = "Bloco Pablo"),
        CarnivalBlockModel(
            price = "125.7",
            date = Calendar.getInstance(),
            type = CarnivalBlockType.ALTERNATIVO,
            name = "Bloco do Alok"),
        CarnivalBlockModel(
            price = "0.0",
            date = Calendar.getInstance(),
            type = CarnivalBlockType.LGBTQ,
            name = "Bloco do Sai Hetero Chato")
        );
}