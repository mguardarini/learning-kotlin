package com.example.migrate.extension

import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

fun String.BrazilianPriceFormat(): String {
    val priceDecimal = BigDecimal(this);
    val brasilianFormat = DecimalFormat.getCurrencyInstance(Locale("pt","br"));
    return brasilianFormat.format(priceDecimal);
}

fun String.CaracteresLimitAt(characters:Int):String {
    if (this.length > characters) {
        var startIndex = 0;
        return "${this.substring(startIndex, characters)}..."
    }
    return this;
}