package com.ivoi.reactions

import com.ivoi.messages.*
import com.ivoi.vademecum.Topic

class ReactionTable(
    private val possibleReactions: HashMap<Topic, PossibleReaction>
) {

    fun evaluate(message: Message): Content =
        possibleReactions[message.content.topic]?.evaluate() ?: NullContent()

}
