package `in`.surelocal.notsapp.splash

import `in`.surelocal.notsapp.MainActivity
import `in`.surelocal.notsapp.R
import `in`.surelocal.notsapp.login.LoginActivity
import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


class SplashFragment : Fragment() {

    companion object {
        fun newInstance() = SplashFragment()
    }

    private lateinit var viewModel: SplashViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.splash_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(SplashViewModel::class.java)
       Handler().postDelayed({
           startActivity(Intent(requireContext(),LoginActivity::class.java))
           (requireContext() as MainActivity).finish()
       },2000)
    }

}
