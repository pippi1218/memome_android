package io.github.pippi1218.memome.domain.model

/**
 * タスクモデル
 * @param id　ID
 * @param title タイトル
 * @param memo メモ
 */
data class Task(
    val id: Long = 0,
    val title: String,
    val memo: String
)
