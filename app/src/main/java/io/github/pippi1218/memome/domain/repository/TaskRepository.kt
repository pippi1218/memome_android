package io.github.pippi1218.memome.domain.repository

import io.github.pippi1218.memome.domain.model.Task

/**
 * タスクリポジトリ
 */
interface TaskRepository {
    /**
     * タスクを追加する
     */
    fun createTask(task: Task)

    /**
     * すべてのタスクを取得する
     */
    fun readTaskAll(): List<Task>
}
