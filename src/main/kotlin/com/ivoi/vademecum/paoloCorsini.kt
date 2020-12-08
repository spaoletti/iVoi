package com.ivoi.vademecum

import com.ivoi.Participant
import com.ivoi.actions.ActionTable
import com.ivoi.actions.PossibleAction
import com.ivoi.messages.TextContent
import com.ivoi.reactions.PossibleReaction
import com.ivoi.reactions.ReactionTable

val paoloCorsini = Participant(
    "Paolo Corsini",
    ActionTable(listOf(
        PossibleAction(5, listOf(
            TextContent("*Foto di montagna*", Topic.MONTAGNA),
        )),
        PossibleAction(5, listOf(
            TextContent("*Foto di un piatto di pasta*", Topic.MANGIARE),
        )),
        PossibleAction(5, listOf(
            TextContent("Stasera vi sarebbe qualcuno? Quorum quattro", Topic.USCIRE),
        )),
        PossibleAction(5, listOf(
            TextContent("*Foto di noi in montagna*", Topic.AMARCORD),
            TextContent("*Foto di noi da giovani*\nRicordi...", Topic.AMARCORD),
        )),
    )),
    ReactionTable(hashMapOf(
        Topic.MONTAGNA to PossibleReaction(75, listOf(
            TextContent("❤❤❤❤"),
            TextContent("Grandissimo ❤"),
        )),
        Topic.MANGIARE to PossibleReaction(75, listOf(
            TextContent("❤❤"),
            TextContent("Favoloso"),
        )),
        Topic.MORTO to PossibleReaction(25, listOf(
            TextContent("E anche lui ci abbandona..."),
        )),
        Topic.DONNA to PossibleReaction(65, listOf(
            TextContent("Audace"),
            TextContent("#####"),
        )),
        Topic.USCIRE to PossibleReaction(35, listOf(
            TextContent("No ragazzi ho staccato da lavoro adesso"),
        )),
        Topic.COMPLEANNO to PossibleReaction(90, listOf(
            TextContent("Auguri!"),
        )),
        Topic.AMARCORD to PossibleReaction(75, listOf(
            TextContent("I migliori"),
            TextContent("Lacrime"),
        )),
    ))
)
