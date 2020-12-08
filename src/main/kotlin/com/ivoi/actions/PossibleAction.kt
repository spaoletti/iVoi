package com.ivoi.actions

import com.ivoi.messages.Content
import kotlin.random.Random

class PossibleAction(
    val frequency: Int,
    private val contents: List<Content>
) {

    fun getContent(): Content = contents[Random.nextInt(contents.size)]

}
