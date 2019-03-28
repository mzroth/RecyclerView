package com.example.listMaker

import android.content.Context
import android.preference.PreferenceManager

class ListDataManager(val context: Context) {

    fun saveList(list: TaskList) {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context).edit()
        sharedPreferences.putStringSet(list.name, list.tasks.toHashSet())
        sharedPreferences.apply()
    }

    fun readLists(): ArrayList<TaskList> {
        val sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context)
        val sharedPreferencesContents = sharedPreferences.all
        val taskSet = ArrayList<TaskList>()

        for (item in sharedPreferencesContents) {
            val list = TaskList(item.key, ArrayList(item.value as HashSet<String>))
            taskSet.add(list)
        }
        return taskSet
    }
}