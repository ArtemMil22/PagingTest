package com.example.pagingtest.model

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pagingtest.model.users.repositories.room.UserDbEntity
import com.example.pagingtest.model.users.repositories.room.UsersDao

@Database(
    version = 1,
    entities = [
        UserDbEntity::class
    ]
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getUsersDao(): UsersDao

}
