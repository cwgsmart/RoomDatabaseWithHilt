package com.example.roomdemo.db

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(indices = [Index(value = ["teamName"], unique = true)])
data class Team(
    @PrimaryKey(autoGenerate = true) var id: Long,
    var teamName: String,
    var teamMemberCount: Int
) {
    constructor() : this(0, "", 0)
}