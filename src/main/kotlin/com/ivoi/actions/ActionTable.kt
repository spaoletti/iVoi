package com.ivoi.actions

import com.ivoi.messages.Content
import com.ivoi.messages.NullContent
import kotlin.random.Random

class ActionTable(private val possibleActions: List<PossibleAction>) {

    fun evaluate(): Content {
        val rnd = Random.nextInt(100)
        var totPercent = 0
        for (possibleAction in possibleActions) {
            totPercent += possibleAction.frequency
            if (rnd < totPercent)
                return possibleAction.getContent()
        }
        return NullContent()
    }

}
