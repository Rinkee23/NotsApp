package `in`.surelocal.notsapp

import `in`.surelocal.notsapp.data.DataEntryViewModel
import `in`.surelocal.notsapp.datalayer.UserInfo
import `in`.surelocal.notsapp.notes.NotesActivity
import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.firebase.firestore.FirebaseFirestore
import kotlinx.android.synthetic.main.data_entry_fragment.*


class DataEntryFragment : Fragment() {
    lateinit var firestore: FirebaseFirestore
    var currentTimestamp = System.currentTimeMillis()
    companion object {
        fun newInstance() = DataEntryFragment()
    }

    private lateinit var viewModel: DataEntryViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        firestore = FirebaseFirestore.getInstance()
        return inflater.inflate(R.layout.data_entry_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(DataEntryViewModel::class.java)

        data_entry_fragment_btn.setOnClickListener {
            val title = data_entry_fragment_title.text.toString().trim()
            val description = data_entry_fragment_description.text.toString()
            if (title == "" || description == "") {

            } else {
                val data = UserInfo(title = title, description = description,Timestamp = currentTimestamp)

                firestore.collection("users").document().set(data).addOnSuccessListener {
                    Toast.makeText(requireContext(),"save", Toast.LENGTH_SHORT).show()
                    startActivity(Intent(requireContext(),NotesActivity::class.java))
                }

            }

        }

    }
}
