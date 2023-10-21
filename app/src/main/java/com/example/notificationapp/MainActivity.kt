package com.example.notificationapp

import android.app.NotificationManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.app.NotificationCompat
import com.example.notificationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding:ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.highBtn.setOnClickListener {
            val notification = NotificationCompat.Builder(this,App().CHANNEL_ID1)
            notification.setContentTitle(binding.titleET.text.toString())
            notification.setContentTitle(binding.contentET.text.toString())
            notification.setSmallIcon(R.drawable.high)
                notification.setPriority(NotificationCompat.PRIORITY_HIGH)
                .build()

            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.notify(1,notification.build())

        }

        binding.lowBtn.setOnClickListener {

            val notification = NotificationCompat.Builder(this,App().CHANNEL_ID2)
            notification.setContentTitle(binding.titleET.text.toString())
            notification.setContentTitle(binding.contentET.text.toString())
            notification.setSmallIcon(R.drawable.low)
            notification.setPriority(NotificationCompat.PRIORITY_LOW)
                .build()

            val manager = getSystemService(NOTIFICATION_SERVICE) as NotificationManager
            manager.notify(2,notification.build())

        }
    }
}