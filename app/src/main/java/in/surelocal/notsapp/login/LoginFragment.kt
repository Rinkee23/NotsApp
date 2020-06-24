package `in`.surelocal.notsapp.login

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import `in` .surelocal.notsapp.R
import `in`.surelocal.notsapp.data.DataEntryActivity
import android.content.Intent
import android.util.Patterns
import android.widget.Toast
import kotlinx.android.synthetic.main.login_fragment.*

class LoginFragment : Fragment() {

    companion object {
        fun newInstance() = LoginFragment()
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.login_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        login_fragment_btn.setOnClickListener {
            val email = login_fragment_Name.text.toString().trim()
            val password = password_edit_password.text.toString().trim()
            if (email.isEmpty()){
                login_fragment_userName.error = "empty"
                login_fragment_userName.requestFocus()
            }else if (password.isEmpty()){
                login_fragment_password.error = "Empty"
                login_fragment_password.requestFocus()

            }else if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                login_fragment_Name.error = "Invalid Email"
                login_fragment_Name.requestFocus()

            }else{
                Toast.makeText(requireContext(),"Login SuccessFull",Toast.LENGTH_SHORT).show()
                startActivity(Intent(requireContext(),DataEntryActivity::class.java))
            }
        }

    }

}
