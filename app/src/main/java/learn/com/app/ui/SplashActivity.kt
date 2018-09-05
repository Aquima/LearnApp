package learn.com.app.ui

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import learn.com.app.R
import kotlinx.android.synthetic.main.activity_splash.*
import learn.com.app.model.User

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Log.v("SplashActivity","Splash")
        btnSaltar.setOnClickListener {
            goLogin(it)
            Log.v("SplashActivity","Click")
        }
        var userA:User = User("Raul")
        var userB:User = User("Alex")
        var userC:User = User("Elver")
        var userD:User = User("Perez")
        var userF:User = User("Sebastian")
        var userG:User = User("Miguel")

        var listUser =  mutableListOf(userA,userB)

        listUser.add(userC)
        listUser.add(userD)
        listUser.add(userF)
        listUser.add(userG)

        Log.v("SplashActivity",listUser.first().nombre)
        Log.v("SplashActivity",listUser.last().nombre)

        var newList:List<User>
        newList = listUser.filter { it.nombre == "SEBASTIAN" }
        Log.v("SplashActivity",newList.last().nombre)

    }
    private fun goLogin (view: View) {
        Log.v("Actions","This Action Create One new Activity")
        val loginView = Intent(this, LogInActivity::class.java)
        startActivity(loginView)
    }
}
