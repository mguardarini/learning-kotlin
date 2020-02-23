package com.example.migrate.extension

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.BrazilianDateFormat():String{
    return SimpleDateFormat("dd/MM/yyyy").format(this.time);
}