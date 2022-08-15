package net.danlew.sharedtestmoduleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.danlew.sharedtestmoduleexample.databinding.ActivityMainBinding
import net.danlew.sharedtestmoduleexample.library.RealMessenger

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.text.text = RealMessenger.createMessage()
    }
}