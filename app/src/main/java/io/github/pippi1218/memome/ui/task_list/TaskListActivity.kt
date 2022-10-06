package io.github.pippi1218.memome.ui.task_list

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.github.pippi1218.memome.R

/**
 * タスク一覧画面のアクティビティ
 */
class TaskListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.task_list_activity)
    }
}
