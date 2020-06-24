package `in`.surelocal.notsapp.notes

import `in`.surelocal.notsapp.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class NotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, NotesFragment.newInstance()).commit()
    }
}
