package com.example.migrate.model

import java.math.BigDecimal
import java.util.*

class Blocos (val valor:BigDecimal,
              val date: Calendar = Calendar.getInstance(),
              val tipo : Tipo,
              val categoria:String);