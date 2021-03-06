package com.architecture.clean.presentation.base

import androidx.recyclerview.widget.DiffUtil

class BaseDiffUtil<T>(private val newList: ArrayList<T>, private val oldList: List<T>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition]?.equals(newList[newItemPosition])!!
    }
}