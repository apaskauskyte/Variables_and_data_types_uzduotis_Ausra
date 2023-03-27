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

        val suma = maxByte + maxShort + maxInt + maxLong

        var float: Float? = null
        var double: Double? = null

        val percentageChar = '\u0025'
        val eightChar = '\u0038'
        val asteriskChar = '*'
        val asteriskCharId = asteriskChar.code

        Log.i(TAG, "Maximum Byte Value: $maxByte\n" +
                "Maximum Short Value: $maxShort\n" +
                "Maximum Integer Value: $maxInt\n" +
                "Maximum Long Value: $maxLong\n" +
                "Sum of Maximum Values: $suma\n" +
                "Reference of Float: $float\n" +
                "Reference of Double: $double\n" +
                "% Character: $percentageChar\n" +
                "8 Character: $eightChar\n" +
                "* Character ID: $asteriskCharId")
    }
}