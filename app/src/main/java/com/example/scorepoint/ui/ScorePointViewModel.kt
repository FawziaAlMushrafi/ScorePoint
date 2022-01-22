package com.example.scorepoint.ui

import androidx.lifecycle.ViewModel
import android.widget.Toast

class ScorePointViewModel: ViewModel() {
    private var _scoure = 0.0
    val score: Double get() = _scoure
    private var _action = ""
    val action: String get() = _action

    fun addOnePoint():  String?{
        return if (_scoure < 100.0) {
            _scoure += 1
            _action = "You're add one point"
            null
        } else {
            "You can not add"
        }
    }
    fun subTwoPoint(): String?{
        return if (_scoure >= 2.0) {
            _scoure -= 2
            _action = "You're subtract two point"
            null
        } else {
            "You can  not subtract"
        }
    }
    fun addFourPoint(): String?{
        return if (_scoure < 98.00) {
            _scoure += 4
            _action = "You're add four point"
            null
        } else {
            "You can not add"
        }
    }
}