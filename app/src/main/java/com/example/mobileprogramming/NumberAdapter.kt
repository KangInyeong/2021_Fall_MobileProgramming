package com.example.mobileprogramming

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.mobileprogramming.databinding.ItemViewBinding

class NumberAdapter(val myNumber:MutableList<Number>): RecyclerView.Adapter<NumberAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val number = myNumber.get(position)
        holder.bind(number)
    }

    override fun getItemCount(): Int {
        return myNumber.size
    }

    class ViewHolder(val binding: ItemViewBinding) : RecyclerView.ViewHolder(binding.root) {


        init {
            binding.root.setOnClickListener {
                Toast.makeText(
                    binding.root.context,
                    "Success! ${binding.id}'s grade is ${binding.first}!!!",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }

            fun bind(number: Number) {
                binding.id.text = number.id.toString()
                binding.first.text = number.first.toString()
                binding.second.text = number.second.toString()
                binding.third.text = number.third.toString()
                binding.fourth.text = number.fourth.toString()
                binding.fifth.text = number.fifth.toString()
                binding.sixth.text = number.sixth.toString()
            }

    }
}