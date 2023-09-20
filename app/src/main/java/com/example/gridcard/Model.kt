package com.example.gridcard

class Model(private var course_name:String, private var course_img:Int) {
    fun getCourse_name():String{
        return course_name
    }
    fun getCourse_img():Int{
        return course_img
    }
    fun setCourse_name(course_name: String){
        this.course_name = course_name
    }
    fun setCourse_img(course_img: Int){
        this.course_img = course_img
    }
}