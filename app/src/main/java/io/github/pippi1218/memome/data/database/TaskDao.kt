package io.github.pippi1218.memome.data.database

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

/**
 * タスクデータアクセスオブジェクト
 */
@Dao
interface TaskDao {
    // すべてのタスクを取得する
    @Query("SELECT * FROM taskEntity")
    fun readAll(): List<TaskEntity>

    // 指定されたIDのタスクを取得する
    @Query("SELECT * FROM taskEntity WHERE id")
    fun read(id: Long)

    // タスクを追加する
    @Insert
    fun create(taskEntity: TaskEntity)

    // すべてのタスクを削除する
    @Delete
    fun deleteAll(taskEntity: TaskEntity)
}
