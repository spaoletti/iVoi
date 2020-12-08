package com.ivoi.messages

import com.ivoi.vademecum.Topic

abstract class Content {
    abstract val topic: Topic
    abstract val text: String
}

@Suppress("UNUSED_PARAMETER")
class NullContent: Content()  {

    override val topic: Topic
        get() = nope()
    override val text: String
        get() = nope()

    private fun nope(): Nothing = throw NullContentException()

}

class TextContent(
    override val text: String,
    override val topic: Topic = Topic.NULL
): Content() {
    override fun toString(): String = text
}

class NullContentException : Throwable()