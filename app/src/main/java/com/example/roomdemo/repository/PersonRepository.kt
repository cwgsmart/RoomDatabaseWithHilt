package com.example.roomdemo.repository

import com.example.roomdemo.db.TeamDao
import javax.inject.Inject

class PersonRepository @Inject constructor(
    private  var  teamDao: TeamDao
) : Repository {
    suspend fun getAllTeam() = teamDao.getAllTeam()
}