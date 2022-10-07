package io.github.pippi1218.memome.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * タスクエンティティ
 * @param id　ID
 * @param title タイトル
 * @param memo メモ
 */
@Entity
data class TaskEntity(
    @PrimaryKey
    val id: Long,
    val title: String,
    val memo: String
)
