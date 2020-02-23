package com.example.migrate.model

import java.util.*

class CarnivalBlockModel (val price:String,
                          val date: Calendar = Calendar.getInstance(),
                          val type : CarnivalBlockType,
                          val name:String);