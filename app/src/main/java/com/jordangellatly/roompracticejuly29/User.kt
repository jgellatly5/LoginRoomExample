package com.jordangellatly.roompracticejuly29

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_table")
data class User(
    @PrimaryKey @ColumnInfo(name = "email") val email: String,
    @ColumnInfo(name = "password") val password: String
)