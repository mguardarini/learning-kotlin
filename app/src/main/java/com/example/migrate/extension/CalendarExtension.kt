package com.example.migrate.extension

import java.text.SimpleDateFormat
import java.util.*


fun Calendar.BrazilianDateFormat():String
{
    var formatoBrasileiro = SimpleDateFormat("dd/MM/yyyy");
    return formatoBrasileiro.format(this.time);
}
