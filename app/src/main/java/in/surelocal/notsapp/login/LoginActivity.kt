package `in`.surelocal.notsapp.login

import `in`.surelocal.notsapp.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, LoginFragment.newInstance()).commit()
    }
}
