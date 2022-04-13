package com.example.examplerecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.examplerecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        refreshRecyclerView()

    }

    private fun refreshRecyclerView() {
        // adapter 인스턴스 생성
        val adapter = Adapter()
        // 어댑터의 itemList와 ItemList 클래스의 itemList를 일치시키는 코드
        adapter.itemList = ItemList.itemList
        // activity_main의 리사이클러뷰 어댑터를 (직접 만든) Adapter로 설정하는 코드
        binding.recyclerView.adapter = adapter
        // activity_main의 리사이클러뷰 레이아웃 메니져를 리니어레이아웃으로 설정하는 코드
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
    }
}