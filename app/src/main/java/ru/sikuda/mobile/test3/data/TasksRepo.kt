package ru.sikuda.mobile.test3.data

import android.content.Context
import ru.sikuda.mobile.test3.model.Tasks

object TasksRepo {

    fun getTasksList(context: Context) = listOf(

        Tasks( 1, "task1"),
        Tasks( 2, "task2"),
        Tasks( 3, "task3"),
        Tasks( 4, "task4"),
        Tasks( 5, "task5"),
        Tasks( 6, "task6"),

    )

}