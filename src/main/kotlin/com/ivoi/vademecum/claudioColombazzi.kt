package com.ivoi.vademecum

import com.ivoi.Participant
import com.ivoi.actions.ActionTable
import com.ivoi.actions.PossibleAction
import com.ivoi.messages.TextContent
import com.ivoi.reactions.PossibleReaction
import com.ivoi.reactions.ReactionTable

val claudioColombazzi = Participant(
    "Colo",
    ActionTable(listOf(
        PossibleAction(5, listOf(
            TextContent("*Foto di un giochino*\nE anche questo è andato..."),
            TextContent("*Link alla notizia di un asteroide*"),
        )),
    )),
    ReactionTable(hashMapOf(
        Topic.MONTAGNA to PossibleReaction(15, listOf(
            TextContent("Grande"),
        )),
        Topic.DONNA to PossibleReaction(75, listOf(
            TextContent("Molto bene"),
        )),
        Topic.USCIRE to PossibleReaction(75, listOf(
            TextContent("Niet"),
            TextContent("Camelot?"),
        )),
        Topic.COMPLEANNO to PossibleReaction(90, listOf(
            TextContent("Auguri"),
        )),
    ))
)
