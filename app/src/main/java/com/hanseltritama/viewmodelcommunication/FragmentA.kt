package com.hanseltritama.viewmodelcommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_a.view.*
import kotlinx.android.synthetic.main.fragment_b.*

class FragmentA : Fragment() {

    private val viewModel: SharedViewModel by lazy {
        ViewModelProvider(this).get(SharedViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_a, container, false)

        view.fragment_a_button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                viewModel.setText(fragment_a_edit_text.text.toString())
            }
        })

        viewModel.getText().observe(this, Observer {
            activity!!.fragment_b_edit_text.setText(it)
        })

        return view
    }
}