package uk.co.projectprime.listmaker

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class ListSelectionRecyclerViewAdapter(val lists : ArrayList<TaskList>): RecyclerView.Adapter<ListSelectionViewHolder>(){

    val listTitles = arrayOf("Shopping List", "Chores", "Android Tuts")


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListSelectionViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.vh_list_selection, parent, false)
        return ListSelectionViewHolder(view)

    }

    override fun onBindViewHolder(holder: ListSelectionViewHolder, position: Int) {

        if (holder !=null){

            holder.listPosition.text = (position + 1).toString()
            holder.listTitle.text = lists.get(position).name
        }

    }


    override fun getItemCount(): Int {
        return listTitles.size
    }


}