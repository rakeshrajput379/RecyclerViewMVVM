package com.rakesh.recyclerviewmvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityVM : ViewModel() {

    private val arrayList: ArrayList<MainActivityM> = ArrayList()

    private val _rvArrayList : MutableLiveData<ArrayList<MainActivityM>> = MutableLiveData(arrayList)

    val rvArrayList: LiveData<ArrayList<MainActivityM>> = _rvArrayList


    fun addRecyclerViewData() : ArrayList<MainActivityM>{

        val arrayList: ArrayList<MainActivityM> = ArrayList()

            val mrvDataObject  = MainActivityM("Rakesh ","Flat No 605, Manawada Nagpur","8080623356")

            arrayList.add(mrvDataObject)


        val mrvDataObject1  = MainActivityM("Ajay ","Flat No 605, Thane Mumbai","8080623356")

        arrayList.add(mrvDataObject1)

        val mrvDataObject2  = MainActivityM("Vijay ","Flat No 605, vashi mumbai","8080623356")

        arrayList.add(mrvDataObject2)

        val mrvDataObject3  = MainActivityM("Suresh ","Flat No 605, Manawada Nagpur","8080623356")

        arrayList.add(mrvDataObject3)
        val mrvDataObject4  = MainActivityM("Raju ","Flat No 605, Manawada Nagpur","8080623356")

        arrayList.add(mrvDataObject4)


        return  arrayList

    }

}