package com.ivoi

import com.ivoi.messages.NullContent
import com.ivoi.messages.TextMessage

class Chat(
    private var participants: List<Participant>,
    private var secondsBetweenMessages: Long = 1
) {
    val messages = mutableListOf<TextMessage>()

    fun post(message: TextMessage) {
        if (message.content is NullContent)
            return
        messages.add(message)
        println("$message\n")
    }

    fun start() {
        while (true) {
            for (participant in participants) {
                participant.check(this)
                Thread.sleep(secondsBetweenMessages * 1000)
            }
        }
    }

}
