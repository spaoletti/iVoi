package com.ivoi.reactions

import com.ivoi.messages.*
import kotlin.random.Random

class PossibleReaction(
    private val frequency: Int,
    private val contents: List<TextContent>
) {

    fun evaluate(): Content {
        if (Random.nextInt(100) < frequency)
            return contents[Random.nextInt(contents.size)]
        return NullContent()
    }

}
