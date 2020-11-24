package com.example.mghandroidcheckin

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mghandroidcheckin.HomeViewModel
import com.example.mghandroidcheckin.R
import com.google.firebase.auth.FirebaseAuth
//import com.google.firebase.firestore.CollectionReference
//import com.google.firebase.firestore.ListenerRegistration
//import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import edu.bu.metcs673.project.ui.notifications.NotificationsViewModel

//import edu.bu.metcs673.project.R
//import edu.bu.metcs673.project.adapter.chat.SearchAdapter
//import edu.bu.metcs673.project.model.chat.UserEmailModel

/**
 * @brief Class to search for all Users registered to Inner Circle Application
 */
class NotificationsFragment : Fragment() {
    private lateinit var notificationsViewModel: NotificationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        notificationsViewModel =
            ViewModelProviders.of(this).get(NotificationsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text_home)
        notificationsViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

}