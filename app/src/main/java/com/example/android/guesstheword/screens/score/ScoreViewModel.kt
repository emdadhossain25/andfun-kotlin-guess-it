package com.example.android.guesstheword.screens.score

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(finalScore: Int) : ViewModel() {

    private val _score = MutableLiveData<Int>()

    val score: LiveData<Int>
        get() = _score


    private val _playAgainEvent = MutableLiveData<Boolean>()

    val playAgainEvent: LiveData<Boolean>
        get() = _playAgainEvent

    init {
        _score.value = finalScore
        _playAgainEvent.value = false
        Log.i("ScoreViewModel", "finalScore is $finalScore")
    }

    fun onPlayAgain() {
        _playAgainEvent.value = true
    }

    fun playAgainComplete() {
        _playAgainEvent.value = false

    }
}