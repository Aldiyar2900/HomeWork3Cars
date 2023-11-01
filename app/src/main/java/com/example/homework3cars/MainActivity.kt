package com.example.homework3cars


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.homework3cars.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private var titlesList = mutableListOf<String>()
    private var descList = mutableListOf<String>()
    private var imagesList = mutableListOf<Int>()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.rvRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.rvRecyclerView.adapter = RecyclerAdapter(titlesList, descList, imagesList)

        //
        postToList()
    }

    private fun addToList(title: String, description:String, image: Int){
        titlesList.add(title)
        descList.add(description)
        imagesList.add(image)
    }
    private fun postToList(){
        addToList("BMW", "BMW is made in German",R.drawable.bmw )
        addToList("Mercedes-Benz", "Mers is made in German", R.drawable.mercedes)
        addToList("Audi", "Audi is made in German", R.drawable.audi)



    }
}