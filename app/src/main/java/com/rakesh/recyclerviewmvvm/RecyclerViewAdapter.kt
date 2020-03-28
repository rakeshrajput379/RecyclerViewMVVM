package com.rakesh.recyclerviewmvvm

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import com.rakesh.recyclerviewmvvm.databinding.RowActivityRecyclerViewBinding

class RecyclerViewAdapter(var arrayList: ArrayList<MainActivityM>,var context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>()  {

    inner class ViewHolderRV(val rowActivityRecyclerViewBinding: RowActivityRecyclerViewBinding) : RecyclerView.ViewHolder(rowActivityRecyclerViewBinding.root){

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)

        val applicationBinding = RowActivityRecyclerViewBinding.inflate(layoutInflater,parent,false)

        val rowActivityRecyclerViewVM:RecyclerViewRowVM = ViewModelProviders.of(parent.context as FragmentActivity).get(RecyclerViewRowVM::class.java)

        applicationBinding.rowRecyclerViewVM = rowActivityRecyclerViewVM

        applicationBinding.lifecycleOwner = parent.context as FragmentActivity

        return ViewHolderRV(applicationBinding)

    }

    override fun getItemCount(): Int {

        return  arrayList.size

    }

    override fun getItemViewType(position: Int): Int {
        return position
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val holder = holder as ViewHolderRV

        holder.rowActivityRecyclerViewBinding.rowRecyclerViewM = arrayList[position]

    }
}