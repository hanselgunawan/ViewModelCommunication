package com.hanseltritama.viewmodelcommunication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_b.view.*

class FragmentB : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View = inflater.inflate(R.layout.fragment_b, container, false)

        view.fragment_b_button.setOnClickListener(object: View.OnClickListener {
            override fun onClick(v: View?) {

            }
        })

        return view
    }
}