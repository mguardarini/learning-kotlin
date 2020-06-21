//package com.example.migrate.daggerModules.logsModule
//import android.content.Context
//import com.example.migrate.logs.Logs
//import dagger.Module
//import dagger.Provides
//import javax.inject.Inject
//import javax.inject.Named
//
//@Module
//open class LogsModuleDagger {
//
//    @Inject
//    lateinit var _context : Context
//
//    @Provides
//    @Named("ApplicationLogs")
//    fun providerLogs(): Logs {
//        return Logs(_context)
//    }
//
//}