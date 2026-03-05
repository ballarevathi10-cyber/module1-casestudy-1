package project.satvika

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var linearText: TextView
    private lateinit var relativeText: TextView
    private lateinit var constraintText: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        linearText = findViewById(R.id.linearText)
        relativeText = findViewById(R.id.relativeText)
        constraintText = findViewById(R.id.constraintText)
        button = findViewById(R.id.changeTextButton)

        button.setOnClickListener {
            linearText.text = "Hello from LinearLayout!"
            relativeText.text = "Hello from RelativeLayout!"
            constraintText.text = "Hello from ConstraintLayout!"
        }
    }
}