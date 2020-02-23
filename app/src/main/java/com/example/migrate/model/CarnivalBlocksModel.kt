package com.example.migrate.model
import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

class CarnivalBlocksModel (val price:String,
                           val date: Calendar = Calendar.getInstance(),
                           val type : Tipo,
                           val name:String);