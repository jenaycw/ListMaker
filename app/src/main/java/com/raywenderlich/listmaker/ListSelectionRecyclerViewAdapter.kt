
package com.raywenderlich.listmaker

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
val listTitles = arrayOf("Shopping List", "Chores", "Android Tutorials")
class ListSelectionRecyclerViewAdapter :
    RecyclerView.Adapter<ListSelectionViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_selection_view_holder,
                parent,
                false)
        return ListSelectionViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listTitles.size
    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {
        holder.listPosition.text = (position + 1).toString()
        holder.listTitle.text = listTitles[position]
    }
}