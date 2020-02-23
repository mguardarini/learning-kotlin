package com.example.migrate.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

fun String.BrazilianPriceFormat(): String {
    val priceDecimal = BigDecimal(this);
    val brasilianFormat = DecimalFormat.getCurrencyInstance(Locale("pt","br"));
    return brasilianFormat.format(priceDecimal);
}