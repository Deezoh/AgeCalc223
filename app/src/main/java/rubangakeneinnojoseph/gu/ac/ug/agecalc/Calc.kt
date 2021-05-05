package rubangakeneinnojoseph.gu.ac.ug.agecalc

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.*

class Calc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.button1)
        button.setOnClickListener { view ->
            printAge(view)
        }
    }
    private fun printAge(view: View){
        var myCalender = Calendar.getInstance()
        var year=myCalender.get(Calendar.YEAR)
        var month = myCalender.get(Calendar.MONTH)
        var day = myCalender.get(Calendar.DAY_OF_MONTH)
//sets the calendar
        DatePickerDialog(this
                ,DatePickerDialog.OnDateSetListener{
            view,year,month,day->
            val selectedDate="$day/${month+1}/$year"
            var dob=Calendar.getInstance()
            dob.set(year,month,day)
// Doing the math
            var age =  myCalender.get(Calendar.YEAR) - dob.get(Calendar.YEAR)
            if(myCalender.get(Calendar.DAY_OF_YEAR) < dob.get(Calendar.DAY_OF_YEAR))
            {
                age--
            }

            var textView2 = findViewById<TextView>(R.id.textView2)
            textView2.text="You are $age years old."
        }
                ,year
                ,month
                ,day).show()
    }
}