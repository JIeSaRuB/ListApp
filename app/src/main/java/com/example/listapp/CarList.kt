package com.example.listapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listapp.databinding.FragmentCarListBinding

class CarList : Fragment() {
    private lateinit var binding: FragmentCarListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentCarListBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageLangList = arrayOf(R.drawable.bmwx5, R.drawable.bmwx6, R.drawable.lamborghini_aventador,
            R.drawable.ford_mustang, R.drawable.bmw_m3, R.drawable.toyota_camri,
            R.drawable.mercedes_benz_gle, R.drawable.tesla_model_s)
        val headingCarList = resources.getStringArray(R.array.carNames)
        val descriptionCarList = resources.getStringArray(R.array.carDescription)
        val langRecyclerView: RecyclerView = binding.carRecyclerView
        langRecyclerView.layoutManager = LinearLayoutManager(context)
        langRecyclerView.adapter = RecyclerAdapter(imageLangList, headingCarList, descriptionCarList)
    }

}