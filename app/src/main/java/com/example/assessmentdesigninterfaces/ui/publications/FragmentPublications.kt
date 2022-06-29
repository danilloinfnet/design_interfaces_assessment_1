package com.example.assessmentdesigninterfaces.ui.publications

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.assessmentdesigninterfaces.R

class FragmentPublications : Fragment() {

    companion object {
        fun newInstance() = FragmentPublications()
    }

    private lateinit var viewModel: FragmentPublicationsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_publications_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentPublicationsViewModel::class.java)
        // TODO: Use the ViewModel
    }

}