package com.example.migrate.activity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.migrate.R
import com.example.migrate.adapter.CarnivalBlocksAdapter
import com.example.migrate.app.NetworkApi
//import com.example.migrate.logs.Logs
import com.example.migrate.mock.MockCarnivalBlocks
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @set:Inject
    internal var networkApi: NetworkApi? = null

//    @Inject
//    lateinit var logs: Logs

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        ConfigurationList();
        AndroidInjection.inject(this)
        networkApi?.validateUser("Mauro","Test")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun ConfigurationList(){
        lista_blocos_carnaval.adapter = CarnivalBlocksAdapter(MockCarnivalBlocks(),this);
    }
}
