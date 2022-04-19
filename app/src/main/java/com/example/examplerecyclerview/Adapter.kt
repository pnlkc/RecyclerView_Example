package com.example.examplerecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.examplerecyclerview.databinding.ItemViewBinding

// Adapter 클래스는 리사이클러뷰의 어댑터에 (직접 만든) 뷰홀더를 연결해서 사용
// ver 2.0에서는 itemList를 기본생성자에서 만듦
class Adapter(private var itemList: ArrayList<ItemData>) : RecyclerView.Adapter<ViewHolder>() {

    // ver 2.0에서는 itemList를 기본생성자에서 만듦
    // 아직은 빈껍데기인 리사이클러뷰에서 사용할 아이템들의 리스트
//    var itemList = ArrayList<ItemData>()

    // 뷰홀더가 생성되는 함수 => 여기서 return 값으로 뷰홀더 객체를 만들어 줌
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    // 생성된 뷰홀더에 데이터를 바인딩(연결)해줌 => 재사용될 뷰홀더 레이아웃에 다음에 사용할 데이터를 연결
    // ViewHolder 클래스에서 만든 bind 함수를 사용하여 연결
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // holder 라는 생성자를 통해 뷰홀더의 객체를 생성하고
        // holder.bind 함수에 위에서 만든 itemList 의 position 번 째 값을 연결
        holder.bind(itemList[position])
    }

    // 아이템의 갯수를 설정하는 코드 => 보통은 아이템리스트의 사이즈를 반환!
    override fun getItemCount(): Int {
        return itemList.size
    }
}