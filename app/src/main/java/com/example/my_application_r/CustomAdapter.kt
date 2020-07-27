package com.example.my_application_r

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class CustomAdapter(context: Context,data:ArrayList<CustomItemClass>) : ArrayAdapter<CustomItemClass>(context,0,data) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView:View? = convertView

        itemView = LayoutInflater.from(context).inflate(R.layout.custom_list_item,parent,false)

        val item: CustomItemClass? = getItem(position)

        val title:TextView = itemView!!.findViewById<TextView>(R.id.item_title)
        title.text = item!!.title

        val desc : TextView = itemView!!.findViewById<TextView>(R.id.item_desc)
        desc.text = item!!.desc

        val image : ImageView = itemView.findViewById<ImageView>(R.id.item_image)
        image.setImageResource(item.image)

        return itemView

    }
}