package `in`.surelocal.notsapp.data

import `in`.surelocal.notsapp.DataEntryFragment
import `in`.surelocal.notsapp.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DataEntryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_entry)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, DataEntryFragment.newInstance()).commit()
    }
}
