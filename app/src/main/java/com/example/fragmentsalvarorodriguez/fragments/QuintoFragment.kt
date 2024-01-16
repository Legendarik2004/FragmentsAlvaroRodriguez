package com.example.fragmentsalvarorodriguez.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.core.view.MenuHost
import androidx.core.view.MenuProvider
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.navigation.fragment.findNavController
import com.example.fragmentsalvarorodriguez.Constants
import com.example.fragmentsalvarorodriguez.R
import com.example.fragmentsalvarorodriguez.databinding.FragmentQuintoBinding


class QuintoFragment : Fragment(), MenuProvider {

    private var _binding: FragmentQuintoBinding? = null
    private val binding get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentQuintoBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        with(binding) {
            irCuarto.setOnClickListener {
                val action =
                    QuintoFragmentDirections.actionQuintoFragmentToCuartoFragment(Constants.QUINTO_MESSAGE)
                findNavController().navigate(action)

            }
            irSexto.setOnClickListener {
                val action =
                    QuintoFragmentDirections.actionQuintoFragmentToSextoFragment(Constants.QUINTO_MESSAGE)
                findNavController().navigate(action)

            }
        }
        val menuHost: MenuHost = requireActivity()
        menuHost.addMenuProvider(this, viewLifecycleOwner, Lifecycle.State.RESUMED)
    }


    //menuprovider
    override fun onCreateMenu(menu: Menu, menuInflater: MenuInflater) {
    //NOP
    }

    override fun onMenuItemSelected(menuItem: MenuItem): Boolean {
        return when (menuItem.itemId) {
            R.id.segundoFragment -> {
                val action =
                    QuintoFragmentDirections.actionQuintoFragmentToSegundoFragment(Constants.QUINTO_MESSAGE)
                findNavController().navigate(action)
                true
            }
            R.id.octavoFragment -> {
                val action =
                    QuintoFragmentDirections.actionQuintoFragmentToOctavoFragment(Constants.QUINTO_MESSAGE)
                findNavController().navigate(action)
                true
            }
            else -> false
        }
    }
}