package com.example.kotlinflag

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.GridLayoutManager
import com.example.kotlinflag.databinding.ActivityMainBinding
import com.example.kotlinflag.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var adapter: LessonAdapter
    private val data = arrayListOf<Lesson>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMainBinding.inflate(LayoutInflater.from(requireContext()), container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Load()

        adapter = LessonAdapter(data)
        binding.res.layoutManager = GridLayoutManager(requireContext(), 1)
    }

    private fun Load() {
        data.add(Lesson("history", R.color.purple_200,
            "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.vectorstock.com%2Froyalty-free-vector%2Fflat-icon-on-background-history-lesson-vector-17501171&psig=AOvVaw0Wksl9MCgtSntVSk4-lZX4&ust=1652678466185000&source=images&cd=vfe&ved=0CAwQjRxqFwoTCLCguZ3h4PcCFQAAAAAdAAAAABAD"))
    }
}