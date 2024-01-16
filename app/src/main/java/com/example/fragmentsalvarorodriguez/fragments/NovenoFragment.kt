package com.example.fragmentsalvarorodriguez.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.fragmentsalvarorodriguez.Constants
import com.example.fragmentsalvarorodriguez.databinding.FragmentNovenoBinding


class NovenoFragment : Fragment() {

    val args: NovenoFragmentArgs by navArgs()

    private var _binding: FragmentNovenoBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentNovenoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            tv2.text = args.mensaje
            irSeptimo.setOnClickListener {
                val action =
                    NovenoFragmentDirections.actionNovenoFragmentToSeptimoFragment(Constants.NOVENO_MESSAGE)
                findNavController().navigate(action)
            }
            irOctavo.setOnClickListener {
                val action =
                    NovenoFragmentDirections.actionNovenoFragmentToOctavoFragment(Constants.NOVENO_MESSAGE)
                findNavController().navigate(action)
            }
        }
    }


}