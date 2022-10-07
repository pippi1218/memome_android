package io.github.pippi1218.memome.data.database

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * タスクデータベース
 */
@Database(entities = [TaskEntity::class], version = 1)
abstract class TaskDatabase : RoomDatabase() {
    abstract fun taskDao(): TaskDao
}
