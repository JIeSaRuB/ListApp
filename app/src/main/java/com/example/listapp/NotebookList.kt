package com.example.listapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listapp.databinding.FragmentNotebookListBinding


class NotebookList : Fragment() {


    private lateinit var binding: FragmentNotebookListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentNotebookListBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val imageLangList = arrayOf(R.drawable.dell_xps13, R.drawable.macbook_air, R.drawable.lenovo_thinkpad_x1_carbon,
            R.drawable.asus_rog_zephyrus_g14, R.drawable.hp_spectre_x360, R.drawable.acer_predator_helios_300,
            R.drawable.microsoft_surface_laptop_4, R.drawable.msi_gs66_stealth)
        val headingNotebookList = resources.getStringArray(R.array.notebooksNames)
        val descriptionNotebookList = resources.getStringArray(R.array.notebooksDescription)
        val langRecyclerView: RecyclerView = binding.computerRecyclerView
        langRecyclerView.layoutManager = LinearLayoutManager(context)
        langRecyclerView.adapter =
            RecyclerAdapter(imageLangList, headingNotebookList, descriptionNotebookList)
    }

}