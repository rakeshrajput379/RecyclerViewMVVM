package com.rakesh.recyclerviewmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.rakesh.recyclerviewmvvm.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding
    lateinit var viewModle : MainActivityVM
    lateinit var recyclerViewActivityAdapter : RecyclerViewAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModle = ViewModelProviders.of(this).get(MainActivityVM::class.java)

        binding.mainVM = viewModle

        binding.lifecycleOwner  = this

        setAdapater()

    }


    fun setAdapater(){

        val rvArrayList: ArrayList<MainActivityM> = viewModle.addRecyclerViewData()

        recyclerViewActivityAdapter = RecyclerViewAdapter(rvArrayList,this)


        val linearLayoutManager = LinearLayoutManager(this)

        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL

        binding.root.rv_list.layoutManager = linearLayoutManager


        binding.root.rv_list.adapter = recyclerViewActivityAdapter


        //  recyclerViewActivityAdapter.notifyDataSetChanged()
    }



}
