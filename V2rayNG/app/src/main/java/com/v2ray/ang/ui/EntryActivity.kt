package com.v2ray.ang.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.v2ray.ang.databinding.ActivityEntryBinding

class EntryActivity : AppCompatActivity() {

    private val binding by lazy { ActivityEntryBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // دکمه "اجرای برنامه" -> ورود به MainActivity
        binding.btnOpenApp.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }

        // فعلاً دکمه "وارد کردن" کاری نمی‌کند (مرحله 2)
        binding.btnImport.setOnClickListener {
            // مرحله 2: اینجا لینک را می‌گیریم و مثل importClipboard ایمپورت می‌کنیم
        }
    }
}
