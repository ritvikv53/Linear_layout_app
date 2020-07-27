package com.example.my_application_r

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = ArrayList<CustomItemClass>()

        items.add(CustomItemClass("Android Dev","learn android from scratch",R.drawable.pic))
        items.add(CustomItemClass("Web Dev","learn webdev from scratch",R.drawable.ppic))
        items.add(CustomItemClass("Android Overview","learn android from me",R.drawable.pick))
        items.add(CustomItemClass("WebsiteAndro Dev","learn Webandroid from scratch",R.drawable.ppick))
        items.add(CustomItemClass("ios Dev","learn ios from scratch",R.drawable.pix))

        val adapter = CustomAdapter(this@MainActivity,items)

        val list : ListView = findViewById<ListView>(R.id.list_view)

        list.adapter = adapter



             list.onItemClickListener = AdapterView.OnItemClickListener {parent, view, position, id ->

                 val alert = Dialog(this@MainActivity)
                 alert.setContentView(R.layout.custom_alert)

                 val title : TextView = alert.findViewById<TextView>(R.id.title_alert)
                 val desc : TextView = alert.findViewById<TextView>(R.id.desc_alert)
                 val image : ImageView = alert.findViewById<ImageView>(R.id.image_alert)
                 val hide : Button = alert.findViewById<Button>(R.id.button_alert)

                 val item : CustomItemClass? = adapter.getItem(position)

                 title.text = item?.title
                 desc.text = item?.desc
                 image.setImageResource(item?.image!!)

                 alert.show()

                 hide.setOnClickListener {
                 alert.dismiss()
                 }








             }












    }
}