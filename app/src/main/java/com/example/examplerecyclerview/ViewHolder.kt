package com.example.examplerecyclerview

import androidx.recyclerview.widget.RecyclerView
import com.example.examplerecyclerview.databinding.ItemViewBinding

// 뷰홀더는 뷰의 세부정보를 담고 있음
// 뷰홀더는 리사이클러 뷰홀더를 상속받고 기본 생성자는 아이템뷰를 바인딩한 것으로 받음
class ViewHolder(val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root) {

    // 아이템 뷰에 있는 뷰들을 변수로 선언
    private val imageView = binding.imageView
    private val textView = binding.textView

    // 아이템 뷰에 있는 뷰에 데이터를 연결
    fun bind(itemData: ItemData) {
        textView.text = itemData.text
        imageView.setImageResource(itemData.image)
    }
}