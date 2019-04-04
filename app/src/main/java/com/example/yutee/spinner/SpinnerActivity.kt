package com.example.yutee.spinner

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.annotation.RequiresApi
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import android.widget.TextView




class SpinnerActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {


    override fun onNothingSelected(parent: AdapterView<*>?) {

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        Toast.makeText(parent?.getContext(), "OnItemSelectedListener :" + parent?.getItemAtPosition(position).toString(),
                Toast.LENGTH_SHORT).show()

    }

    var spinner1: Spinner? = null
    var spinner2: Spinner? = null
    var spinner3 : Spinner? = null


    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        /*spinner1=this.spinner_view*/
        val continent = ArrayAdapter.createFromResource(this, R.array.Continent_List, android.R.layout.simple_spinner_item)
        // Set layout to use when the list of choices appear
        continent.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
       /* spinner1?.getBackground()?.setColorFilter(Color.parseColor("#808000"), PorterDuff.Mode.SRC_ATOP)
        spinner1?.setSelection(0, true)
        val v = spinner1?.getSelectedView()*/
        /*(v as TextView).setTextColor(getColor(R.color.colorPrimaryDark))*/
        // Set Adapter to Spinner
        spinner1?.adapter=continent

        val animal = ArrayAdapter.createFromResource(this, R.array.Animal_List, android.R.layout.simple_spinner_item)
        // Set layout to use when the list of choices appear
        animal.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Set Adapter to Spinner
        spinner2?.adapter=animal


        val state = ArrayAdapter.createFromResource(this, R.array.State_List, android.R.layout.simple_spinner_item)
        // Set layout to use when the list of choices appear
        state.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        // Set Adapter to Spinner
        spinner3?.adapter=state

    }

   /* spinner.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
        @Override
        public void onGlobalLayout() {
            ((TextView) spinner.getSelectedView()).setTextColor(Color.WHITE);
        }
    })*/
}
