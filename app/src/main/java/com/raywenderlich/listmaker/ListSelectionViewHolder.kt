package com.raywenderlich.listmaker

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListSelectionViewHolder {

    class ListSelectionViewHolder(itemView: View):
        RecyclerView.ViewHolder(itemView){
val listPositon = itemView.findViewById(R.id.itemNumber) as TextView
        val listTitle = itemView.findViewById(R.id.itemString) as TextView
    }
}
