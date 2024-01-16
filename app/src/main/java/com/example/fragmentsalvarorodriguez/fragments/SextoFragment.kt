package com.example.fragmentsalvarorodriguez.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.fragmentsalvarorodriguez.Constants
import com.example.fragmentsalvarorodriguez.databinding.FragmentSextoBinding


class SextoFragment : Fragment() {

    val args: SextoFragmentArgs by navArgs()
    private var _binding: FragmentSextoBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentSextoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            tv2.text = args.mensaje
            irCuarto.setOnClickListener {
                val action =
                    SextoFragmentDirections.actionSextoFragmentToCuartoFragment(Constants.SEXTO_MESSAGE)
                findNavController().navigate(action)

            }
            irQuinto.setOnClickListener {
                val action =
                    SextoFragmentDirections.actionSextoFragmentToQuintoFragment(Constants.SEXTO_MESSAGE)
                findNavController().navigate(action)

            }
        }
    }
}