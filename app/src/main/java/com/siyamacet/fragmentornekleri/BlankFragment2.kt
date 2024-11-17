package com.siyamacet.fragmentornekleri

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.siyamacet.fragmentornekleri.databinding.FragmentBlank2Binding
import com.siyamacet.fragmentornekleri.databinding.FragmentBlankBinding

class BlankFragment2 : Fragment() {
    private var _binding: FragmentBlank2Binding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlank2Binding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val isim = BlankFragment2Args.fromBundle(it).kullaniciIsmi

            binding.textView2.text = isim
        }

    }


}