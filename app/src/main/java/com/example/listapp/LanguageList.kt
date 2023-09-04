package com.example.listapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listapp.databinding.FragmentLanguageListBinding


class LanguageList : Fragment() {
    private lateinit var binding: FragmentLanguageListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentLanguageListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageLangList = arrayOf(R.drawable.kotlin, R.drawable.java, R.drawable.c_sharp,
            R.drawable.c_plus_plus, R.drawable.python, R.drawable.javascript,
            R.drawable.go, R.drawable.php)
        val headingLangList = resources.getStringArray(R.array.languagesNames)
        val descriptionLangList = resources.getStringArray(R.array.languagesDescription)
        val langRecyclerView: RecyclerView = binding.langRecyclerView
        langRecyclerView.layoutManager = LinearLayoutManager(context)
        langRecyclerView.adapter = RecyclerAdapter(imageLangList, headingLangList, descriptionLangList)
    }

}