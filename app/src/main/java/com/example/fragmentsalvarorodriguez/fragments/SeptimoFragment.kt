package com.example.fragmentsalvarorodriguez.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.fragmentsalvarorodriguez.Constants
import com.example.fragmentsalvarorodriguez.databinding.FragmentSeptimoBinding


class SeptimoFragment : Fragment() {

    val args: SeptimoFragmentArgs by navArgs()

    private var _binding: FragmentSeptimoBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSeptimoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            tv2.text = args.mensaje
            irOctavo.setOnClickListener {
                val action =
                    SeptimoFragmentDirections.actionSeptimoFragmentToNovenoFragment(Constants.SEPTIMO_MESSAGE)
                findNavController().navigate(action)
            }
            irNoveno.setOnClickListener {
                val action =
                    SeptimoFragmentDirections.actionSeptimoFragmentToNovenoFragment(Constants.SEPTIMO_MESSAGE)
                findNavController().navigate(action)
            }
        }
    }
}