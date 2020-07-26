package com.hanseltritama.viewmodelcommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_a.*
import kotlinx.android.synthetic.main.fragment_b.*
import kotlinx.android.synthetic.main.fragment_b.view.*

class FragmentB : Fragment() {

    private val viewModel: SharedViewModel by lazy {
        ViewModelProvider(this).get(SharedViewModel::class.java)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_b, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        view.fragment_b_button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {
                viewModel.setText(fragment_b_edit_text.text.toString())
            }
        })

        viewModel.getText().observe(this, Observer<String> {
            activity!!.fragment_a_edit_text.setText(it)
        })
    }
}