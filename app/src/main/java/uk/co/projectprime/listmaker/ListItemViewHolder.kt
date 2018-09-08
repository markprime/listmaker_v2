package uk.co.projectprime.listmaker

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

class ListItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val tv_task = itemView.findViewById(R.id.tv_task) as TextView

}