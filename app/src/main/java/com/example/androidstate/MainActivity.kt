package com.example.androidstate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.textservice.TextInfo
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var button: Button
    lateinit var textInfo: TextView
    lateinit var textInfo2: TextView
    lateinit var textInfo3: TextView
    lateinit var textInfo4: TextView
    lateinit var textInfo5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById<Button>(R.id.button)
        textInfo = findViewById<TextView>(R.id.textView)
        textInfo2 = findViewById<TextView>(R.id.textView2)
        textInfo3 = findViewById<TextView>(R.id.textView3)
        textInfo4 = findViewById<TextView>(R.id.textView4)
        textInfo5 = findViewById<TextView>(R.id.textView5)

        button.setOnClickListener {
            textInfo.setText("I have been clicked.")
            textInfo2.setText("I too was clicked.")
            textInfo3.setText("I also was clicked.")
            textInfo4.setText("Me too.")
            textInfo5.setText("Me last")

        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("saved text", textInfo.text.toString())
        outState.putString("saved text", textInfo2.text.toString())
        outState.putString("saved text", textInfo3.text.toString())
        outState.putString("saved text", textInfo4.text.toString())
        outState.putString("saved text", textInfo5.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)

        textInfo.setText(savedInstanceState.getString("saved_text"))
        textInfo2.setText(savedInstanceState.getString("saved_text"))
        textInfo3.setText(savedInstanceState.getString("saved_text"))
        textInfo4.setText(savedInstanceState.getString("saved_text"))
        textInfo5.setText(savedInstanceState.getString("saved_text"))
    }
}