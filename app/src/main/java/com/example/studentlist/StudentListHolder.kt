package com.example.studentlist

import com.google.android.material.animation.Positioning

object StudentListHolder {
    private val studentList = mutableListOf(StudentModel("Ori Abulafia", "123456", "0523343453", "Rishon Lezion", true))

    fun addStudent(student: StudentModel) {
        studentList.add(student)
    }

    fun deleteStudent(index: Int) {
        studentList.removeAt(index)
    }

    fun getStudentList(): List<StudentModel> {
        return studentList
    }

    fun editStudent(newStudent: StudentModel, index: Int) {
        studentList[index] = newStudent
    }

    fun getStudentByPosition(positioning: Int):StudentModel{
        return studentList[positioning]
    }
}