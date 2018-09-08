package uk.co.projectprime.listmaker

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ListSelectionViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){

    val listPosition = itemView.findViewById<TextView>(R.id.item_number)
    val listTitle = itemView.findViewById<TextView>(R.id.item_string)

}