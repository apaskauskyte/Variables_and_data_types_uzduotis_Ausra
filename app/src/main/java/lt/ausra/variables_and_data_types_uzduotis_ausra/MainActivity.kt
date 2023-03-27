package lt.ausra.variables_and_data_types_uzduotis_ausra

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG = "kotlin_variables_tag"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doTaskVariablesAndDataTypes()
    }

    fun doTaskVariablesAndDataTypes() {

        val maxByte = Byte.MAX_VALUE
        val maxShort = Short.MAX_VALUE
        val maxInt = Int.MAX_VALUE
        val maxLong = Long.MAX_VALUE
    }
}