package com.example.roomdemo.db

import androidx.room.*

@Dao
interface TeamDao {
    @Query("select * from Team where teamName = :teamName")
    suspend fun queryTeamByName(teamName: String): MutableList<Team>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWorkPlace(team: Team)

    @Query("delete from Team")
    suspend fun clear()

    @Delete
    suspend fun deleteWorkStepLog(team: Team): Int

    @Query("delete from Team where teamName = :teamName")
    suspend fun deleteTeamByName(teamName: String)

    @Update()
    suspend fun updateTeam(team: Team)

    @Query("select  * from Team")
    suspend fun getAllTeam(): MutableList<Team>

}