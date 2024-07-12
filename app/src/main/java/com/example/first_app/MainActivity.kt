package com.example.first_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val buttonSkills = findViewById<Button>(R.id.btnSkills)
        buttonSkills.setOnClickListener {
        intent = Intent(this, SkillsActivity::class.java)
        startActivity(intent)
        }
        val buttonQualifications = findViewById<Button>(R.id.btnQuali)
        buttonQualifications.setOnClickListener {
            intent = Intent(this, QualificationActivity::class.java)
            startActivity(intent)
        }
        val buttonWorks = findViewById<Button>(R.id.btnWorks)
        buttonWorks.setOnClickListener {
            intent = Intent(this, WorksActivity::class.java)
            startActivity(intent)
        }
        val buttonAchievements= findViewById<Button>(R.id.btnAchieve)
        buttonAchievements.setOnClickListener {
            intent = Intent(this, AchievementsActivity::class.java)
            startActivity(intent)
        }

    }
}