package com.ivoi.vademecum

import com.ivoi.Participant
import com.ivoi.actions.ActionTable
import com.ivoi.actions.PossibleAction
import com.ivoi.messages.TextContent
import com.ivoi.reactions.PossibleReaction
import com.ivoi.reactions.ReactionTable

val francescoBettarini = Participant(
    "Betta",
    ActionTable(listOf(
        PossibleAction(5, listOf(
            TextContent("*Foto di montagna*", Topic.MONTAGNA),
        )),
        PossibleAction(5, listOf(
            TextContent("Addio Norberto", Topic.MORTO),
            TextContent("Addio Gervaso", Topic.MORTO),
        )),
        PossibleAction(3, listOf(
            TextContent("Auguri mitico!", Topic.COMPLEANNO),
        )),
        PossibleAction(5, listOf(
            TextContent("Vi consiglio questo documentario interessantissimo sulla guerra di Crimea", Topic.NOTIZIA),
        )),
        PossibleAction(5, listOf(
            TextContent("*Foto di noi in montagna*", Topic.AMARCORD),
        )),
    )),
    ReactionTable(hashMapOf(
        Topic.MONTAGNA to PossibleReaction(75, listOf(
            TextContent("❤"),
            TextContent("Sublime"),
        )),
        Topic.MANGIARE to PossibleReaction(75, listOf(
            TextContent("❤❤"),
            TextContent("Grandissimo"),
        )),
        Topic.MORTO to PossibleReaction(25, listOf(
            TextContent(":("),
        )),
        Topic.DONNA to PossibleReaction(15, listOf(
            TextContent("Ma lei è un'amica della sara"),
        )),
        Topic.USCIRE to PossibleReaction(25, listOf(
            TextContent("Io ci sono venerdì"),
        )),
        Topic.COMPLEANNO to PossibleReaction(90, listOf(
            TextContent("Auguri!"),
        )),
        Topic.AMARCORD to PossibleReaction(75, listOf(
            TextContent("Lacrime"),
            TextContent("Immensi"),
        )),
    ))
)
