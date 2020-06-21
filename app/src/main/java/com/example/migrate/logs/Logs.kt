//package com.example.migrate.logs
//
//import android.content.Context
//import javax.inject.Inject
//
//open class Logs {
//
//    private  var _context : Context;
//
//    @Inject
//    constructor(context: Context) {
//        _context = context
//    }
//
//    fun logEvent(event: String) : String{
//        return "Logando eventos da tela: ${event}"
//    }
//
//}