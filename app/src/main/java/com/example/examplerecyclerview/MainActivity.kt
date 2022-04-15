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
        // ver 2.0에서는 아래의 과정과 이게 합쳐짐
        // adapter 인스턴스 생성
//        val adapter = Adapter()

        // ver 2.0에서는 위의 과정과 이게 합쳐짐
        // 어댑터의 itemList와 ItemList 클래스의 itemList를 일치시키는 코드
//        adapter.itemList = ItemList.itemList

        // ver 2.0
        // adapter 인스턴스 생성과 동시에 어댑터의 itemList를 ItemList 클래스의 itemList로 일치시킴
        val adapter = Adapter(ItemList.itemList)

        // activity_main의 리사이클러뷰 어댑터를 (직접 만든) Adapter로 설정하는 코드
        binding.recyclerView.adapter = adapter

        // activity_main의 리사이클러뷰 레이아웃 메니져를 리니어레이아웃으로 설정하는 코드
        binding.recyclerView.layoutManager = LinearLayoutManager(this)

        // 위의 레이아웃 매니져 설정을 xml 파일에서
        // app:layoutManager="androidx.recyclerview.widget.LinearLayoutManager"
        // 처럼 설정해도 같은 기능임
    }
}