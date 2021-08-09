package com.quifar.sekolahkuviewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.quifar.sekolahkuviewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val rv = binding.recyclerView
        val studentData = ArrayList<Student>()
        for (i in 0..10){
            val student = Student()
            student.namaDepan = "Rafi Izzatul"
            student.namaBelakang = "Rizqu Faris"
            student.alamat = "Depok"
            student.email = "risqufaris@gmail.com"
            student.gender = "Laki - Laki"
            student.hobi = "Bermain Bola"
            student.jenjang = "SMK"
            student.noHp = "082299189919"
            studentData.add(student)
        }
        rv.adapter = StudentAdapter(studentData)
        rv.layoutManager = LinearLayoutManager(this)
    }
}