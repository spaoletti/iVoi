package com.ivoi.vademecum

import com.ivoi.Participant
import com.ivoi.actions.ActionTable
import com.ivoi.actions.PossibleAction
import com.ivoi.messages.TextContent
import com.ivoi.reactions.PossibleReaction
import com.ivoi.reactions.ReactionTable

val stefanoBardi = Participant(
    "Steppo",
    ActionTable(listOf(
        PossibleAction(5, listOf(
            TextContent("*Foto di montagna*", Topic.MONTAGNA),
        )),
        PossibleAction(5, listOf(
            TextContent("*Foto di una pizza*", Topic.MANGIARE),
            TextContent("*Foto di un panino*", Topic.MANGIARE),
        )),
        PossibleAction(5, listOf(
            TextContent("*Foto di una ####*\nProf questa è per te", Topic.DONNA),
        )),
        PossibleAction(5, listOf(
            TextContent("Maaaa seratina da me?", Topic.USCIRE),
            TextContent("Ma stasera?", Topic.USCIRE),
        )),
        PossibleAction(5, listOf(
            TextContent("*Foto di noi in montagna*\n", Topic.AMARCORD),
        )),
    )),
    ReactionTable(hashMapOf(
        Topic.MONTAGNA to PossibleReaction(75, listOf(
            TextContent("❤❤❤"),
            TextContent("❤"),
        )),
        Topic.MANGIARE to PossibleReaction(75, listOf(
            TextContent("top!!!"),
            TextContent("❤❤"),
        )),
        Topic.USCIRE to PossibleReaction(75, listOf(
            TextContent("Se volete passare..."),
            TextContent("Travalle?"),
        )),
        Topic.COMPLEANNO to PossibleReaction(90, listOf(
            TextContent("Auguri!!!! ❤"),
        )),
        Topic.AMARCORD to PossibleReaction(75, listOf(
            TextContent("❤❤❤❤❤"),
            TextContent("❤❤"),
        )),
    ))
)
