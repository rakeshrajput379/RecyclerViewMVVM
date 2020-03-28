package com.rakesh.recyclerviewmvvm

import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.lifecycle.ViewModel

class RecyclerViewRowVM : ViewModel() {


    fun clickONBtn(view: View, mrvDataM: MainActivityM  ){


        Log.d("Check Data ","Name ::: "+mrvDataM.name)
        Log.d("Check Data ","Address ::: "+mrvDataM.address)
        Log.d("Check Data ","Mobile  ::: "+mrvDataM.mobileNumber)

        Toast.makeText(view.context, "CLick On Btn "+ mrvDataM.name, Toast.LENGTH_LONG).show()

    }


}