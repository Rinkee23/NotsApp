package `in`.surelocal.notsapp.notes

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import `in`.surelocal.notsapp.R
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.row.*

class NotesFragment : Fragment() {
    private lateinit var firestore: FirebaseFirestore

    companion object {
        fun newInstance() = NotesFragment()
    }

    private lateinit var viewModel: NotesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        firestore = FirebaseFirestore.getInstance()
        return inflater.inflate(R.layout.nots_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(NotesViewModel::class.java)
        firestore.collection("users").document().get().addOnSuccessListener {
            val title = row_title.text.toString().trim()
            val description = row_description.text.toString().trim()
            val data = UserInfo(title = title, description = description)
            storedata(data)


        }

    }

    private fun UserInfo(title: String, description: String) {

    }

    private fun storedata(data: Unit) {

    }

}
