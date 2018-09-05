package learn.com.app.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import learn.com.app.R
import io.reactivex.disposables.Disposable
import kotlinx.android.synthetic.main.activity_log_in.*

class LogInActivity : AppCompatActivity() {

    private lateinit var disposable: Disposable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val btnEnter:Button = findViewById(R.id.btnEnter)

        Log.v("LogIn","onCreate")

        btnEnter.setOnClickListener {
           if (this.isFormValidate()) {
               Log.v("LogIn","Valid")
               this.createAndGoHome()
           }else{
               Log.v("LogIn","No Valid")
           }
        }
        val txfUser:EditText = findViewById(R.id.txfUsername)

    }
    fun isFormValidate():Boolean{
        if (txfPassword.text.count() > 5){
            Log.v("LogIn","mayor a 5")
        }
        Log.v("LogIn","Validate Input")
        val txfUser:EditText = findViewById(R.id.txfUsername)

        val txfPassword:EditText = findViewById(R.id.txfPassword)

        if (txfUser.text.count() > 5 && txfPassword.text.count() > 5) {
            return true
        }else {
            return false
        }
    }
    fun createAndGoHome(){

    }
}
