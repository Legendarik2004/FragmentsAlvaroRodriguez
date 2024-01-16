package com.example.fragmentsalvarorodriguez

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import androidx.navigation.NavController
    import androidx.navigation.fragment.NavHostFragment
    import androidx.navigation.ui.setupWithNavController
    import com.example.fragmentsalvarorodriguez.databinding.ActivityMainBottomBinding

class MainActivityBottom : AppCompatActivity() {
    private lateinit var binding: ActivityMainBottomBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBottomBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        navController = navHost.navController
        binding.bottomNavView.setupWithNavController(navController)
    }
}