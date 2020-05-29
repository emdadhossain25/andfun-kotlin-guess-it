package com.example.android.guesstheword.screens.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {
    init {
        Log.i("GameViemodel","init block")
    }

    override fun onCleared() {
        super.onCleared()
        Log.i("GameViemodel","oncleared block")
    }
}