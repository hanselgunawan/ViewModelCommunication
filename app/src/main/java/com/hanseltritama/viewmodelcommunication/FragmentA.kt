package com.hanseltritama.viewmodelcommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_a.view.*

class FragmentA : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_a, container, false)

        view.fragment_a_button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {

            }
        })

        return view
    }
}