package com.example.migrate.activity

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.example.migrate.R
import com.example.migrate.adapter.ListBloquinhosAdapter
import com.example.migrate.model.Blocos
import com.example.migrate.model.Tipo

import kotlinx.android.synthetic.main.activity_main.*
import java.math.BigDecimal
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        var blocosCarnaval = listOf(
            Blocos(
                valor = BigDecimal(200),
                date = Calendar.getInstance(),
                tipo = Tipo.LGBTQ,
                categoria = "Minhoqueens"),
            Blocos(
                valor = BigDecimal(100),
                date = Calendar.getInstance(),
                tipo = Tipo.LGBTQ,
                categoria = "Bloco Pablo"),
            Blocos(
                valor = BigDecimal(100),
                date = Calendar.getInstance(),
                tipo = Tipo.ALTERNATIVO,
                categoria = "Bloco do Alok")
        );

        lista_blocos_carnaval.adapter = ListBloquinhosAdapter(blocosCarnaval,this);
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
