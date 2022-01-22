package com.example.scorepoint.ui


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.scorepoint.databinding.FragmentScorePoint


class ScorePointFragment : Fragment() {
    var binding: FragmentScorePointBinding? = null

    private val viewModel: ScorePointViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScorePointBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding!!.addOnePoint.setOnClickListener{
            showMessage(viewModel.addOnePoint())
            updateScour()
        }
        binding!!.subTwoPoint.setOnClickListener{
            showMessage(viewModel.subTwoPoint())
            updateScour()
        }
        binding!!.addFourPoint.setOnClickListener {
            showMessage(viewModel.addFourPoint())
            updateScour()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
    fun updateScour(){
        binding!!.scoreTextview.setText(viewModel.score.toString())
        binding!!.action.setText(viewModel.action.toString())
    }
    fun showMessage(message: String?) {
        if (message != null)
            Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }

}