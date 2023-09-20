package com.example.gridcard


import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class Adapter(context: Context, courseList: ArrayList<Model>):ArrayAdapter<Model?>(context, 0, courseList as List<Model>)  {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var listItemView = convertView
        if(listItemView == null){
            listItemView = LayoutInflater.from(context).inflate(R.layout.custom_layout, parent, false)
        }s

        val courseModel:Model? = getItem(position)
        val courseName = listItemView!!.findViewById<TextView>(R.id.ItemName)
        val courseImg = listItemView!!.findViewById<ImageView>(R.id.itemImg)

        courseName.setText(courseModel!!.getCourse_name())
        courseImg.setImageResource(courseModel!!.getCourse_img())
        return listItemView
    }
}