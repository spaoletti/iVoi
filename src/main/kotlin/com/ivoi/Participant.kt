package com.ivoi

import com.ivoi.actions.ActionTable
import com.ivoi.messages.Message
import com.ivoi.messages.NullMessage
import com.ivoi.messages.TextMessage
import com.ivoi.reactions.ReactionTable

class Participant(
    private var name: String,
    private val actionTable: ActionTable,
    private val reactionTable: ReactionTable,
    private val secondsBetweenMessages: Long = 1
) {

    private var firstMessageToReadIndex: Int = 0

    fun check(chat: Chat) {
        val messages = chat.messages.filterIndexed { index, message ->
            message.author != this && index >= firstMessageToReadIndex
        }
        for (message in messages) {
            chat.post(react(message))
            Thread.sleep(secondsBetweenMessages * 1000)
        }
        if (messages.isNotEmpty())
            firstMessageToReadIndex = messages.size
        chat.post(act())
    }

    private fun react(message: Message) =
        TextMessage(
            this,
            reactionTable.evaluate(message),
            message
        )

    private fun act() =
        TextMessage(
            this,
            actionTable.evaluate(),
            NullMessage()
        )

    override fun toString() = name

}