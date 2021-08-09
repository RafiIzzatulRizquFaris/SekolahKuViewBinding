package com.quifar.sekolahkuviewbinding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.quifar.sekolahkuviewbinding.databinding.ListItemBinding

class StudentAdapter(private val listStudent: ArrayList<Student>) : RecyclerView.Adapter<StudentAdapter.ViewHolder>() {
    class ViewHolder(val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val student = listStudent[position]
        holder.binding.tvGender.text = student.gender
        holder.binding.tvJenjang.text = student.jenjang
        holder.binding.tvNamaLengkap.text = student.namaDepan + " " + student.namaBelakang
        holder.binding.tvNoHp.text = student.noHp
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }
}