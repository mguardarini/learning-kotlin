package com.example.migrate.model

import java.math.BigDecimal
import java.util.*

class CarnivalBlocksModel (val quantityPeople:BigDecimal,
                           val date: Calendar = Calendar.getInstance(),
                           val type : Tipo,
                           val name:String);