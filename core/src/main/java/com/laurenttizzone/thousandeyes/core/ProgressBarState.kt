package com.laurenttizzone.thousandeyes.core

sealed class ProgressBarState {
    object Loading:ProgressBarState()

    object Idle:ProgressBarState()
}