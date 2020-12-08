package com.ivoi.messages

import com.ivoi.Participant

abstract class Message {
    abstract val content: Content
    abstract val author: Participant
    abstract val repliesTo: Message
}

@Suppress("UNUSED_PARAMETER")
class NullMessage: Message()  {

    override val author: Participant
        get() = nope()
    override val content: Content
        get() = nope()
    override val repliesTo: Message
        get() = nope()

    private fun nope(): Nothing = throw NullMessageException()

}

class TextMessage(
    override val author: Participant,
    override val content: Content,
    override val repliesTo: Message
): Message() {

    override fun toString(): String =
        "$author${replies()}:\n${quote()} \"${content.text}\""

    private fun replies() =
        if (repliesTo is NullMessage) "" else " \u001B[36mreplies to ${repliesTo.author}\u001B[0m"

    private fun quote() =
        if (repliesTo is NullMessage) "" else "\u001B[36m${repliesTo.content.text}\u001B[0m\n"

}

class NullMessageException : Throwable()
