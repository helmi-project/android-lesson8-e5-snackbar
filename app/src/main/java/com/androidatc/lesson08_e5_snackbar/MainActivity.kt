package com.androidatc.lesson08_e5_snackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun MgSnack(view: View) {
        var SnackB: Snackbar = Snackbar.make(findViewById(R.id.ConstraintLayoutId)
            ,"No Internet Connection !!",Snackbar.LENGTH_LONG).setAction("Retry") {}

        SnackB.setActionTextColor(Color.RED)
        SnackB.show()
    }
}
