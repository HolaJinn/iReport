package com.example.ireport

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_user.*

class AdminLogin : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_admin, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Instead of view.findViewById(R.id.hello) as TextView
        forgotPassword?.setOnClickListener {
            val intent = Intent(getActivity(), ForgetPasswordActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        newAccount?.setOnClickListener {
            val intent = Intent(getActivity(), RegisterAdminActivity::class.java)
            getActivity()?.startActivity(intent)
        }

        login?.setOnClickListener {
            val intent = Intent(getActivity(), AdminFeedActivity::class.java)
            getActivity()?.startActivity(intent)
        }
    }
}