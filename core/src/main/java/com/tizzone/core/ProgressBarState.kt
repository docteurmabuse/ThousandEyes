package com.tizzone.core

sealed class ProgressBarState {
    object Loading:ProgressBarState()

    object Idle:ProgressBarState()
}