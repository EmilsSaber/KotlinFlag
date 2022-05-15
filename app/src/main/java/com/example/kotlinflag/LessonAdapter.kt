package com.example.kotlinflag

import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.kotlinflag.databinding.ItemLessonBinding

class LessonAdapter(val data: ArrayList<Lesson>): RecyclerView.Adapter<LessonAdapter.LessonViewHolder>() {

    lateinit var binding: LessonAdapter
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LessonViewHolder {
        return LessonViewHolder(ItemLessonBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onBindViewHolder(holder: LessonViewHolder, position: Int) {
        holder.bind(data.get(position))
    }

    override fun getItemCount() = data.size
    inner class LessonViewHolder(private val binding: ItemLessonBinding) : RecyclerView.ViewHolder(binding.root) {
        @RequiresApi(Build.VERSION_CODES.M)
        fun bind(lesson: Lesson) {
            if (lesson.color != null){
                binding.mainLayout.setBackgroundColor(itemView.context.getColor(lesson.color!!))
            }
            Glide.with(binding.item1)
                .load(lesson.image)
                .into(binding.item1)

            binding.text1.setText(lesson.lesson)
        }
    }
}