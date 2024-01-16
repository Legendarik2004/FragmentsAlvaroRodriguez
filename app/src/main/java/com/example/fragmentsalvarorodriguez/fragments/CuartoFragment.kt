package com.example.fragmentsalvarorodriguez.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.fragmentsalvarorodriguez.Constants
import com.example.fragmentsalvarorodriguez.databinding.FragmentCuartoBinding


class CuartoFragment : Fragment() {

    val args : CuartoFragmentArgs by navArgs()

    private var _binding: FragmentCuartoBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCuartoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            tv2.text = args.mensaje
            irQuinto.setOnClickListener {
                val action = CuartoFragmentDirections.actionCuartoFragmentToQuintoFragment(Constants.CUARTO_MESSAGE)
                findNavController().navigate(action)
            }
            irSexto.setOnClickListener{
                    val action = CuartoFragmentDirections.actionCuartoFragmentToSextoFragment(Constants.CUARTO_MESSAGE)
                findNavController().navigate(action)

            }
        }
    }
}