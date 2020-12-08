package com.ivoi.vademecum

import com.ivoi.Participant
import com.ivoi.actions.ActionTable
import com.ivoi.actions.PossibleAction
import com.ivoi.messages.TextContent
import com.ivoi.reactions.PossibleReaction
import com.ivoi.reactions.ReactionTable

val lucaRomanelli = Participant(
    "Luca",
    ActionTable(listOf(
        PossibleAction(5, listOf(
            TextContent("*Foto di una bottiglia di vino*", Topic.MANGIARE),
        )),
        PossibleAction(5, listOf(
            TextContent("E se n'è andato anche Bud...", Topic.MORTO),
        )),
        PossibleAction(5, listOf(
            TextContent("Stasera o domani?", Topic.USCIRE),
            TextContent("Figlioli, ma una birretta?", Topic.USCIRE),
        )),
        PossibleAction(3, listOf(
            TextContent("Auguri a un grande!", Topic.COMPLEANNO),
        )),
        PossibleAction(5, listOf(
            TextContent("*Foto di noi in montagna*\nMa come s'era belli?", Topic.AMARCORD),
            TextContent("*Foto di noi in montagna*\nChe tosti", Topic.AMARCORD),
        )),
    )),
    ReactionTable(hashMapOf(
        Topic.MONTAGNA to PossibleReaction(50, listOf(
            TextContent("Invidia ❤"),
        )),
        Topic.MANGIARE to PossibleReaction(50, listOf(
            TextContent("❤❤"),
        )),
        Topic.MORTO to PossibleReaction(50, listOf(
            TextContent("Noooo"),
        )),
        Topic.DONNA to PossibleReaction(50, listOf(
            TextContent("Maremma impestata"),
            TextContent("No via"),
        )),
        Topic.USCIRE to PossibleReaction(75, listOf(
            TextContent("Questa settimana ho già giocato il jolly"),
            TextContent("Ci provo"),
        )),
        Topic.COMPLEANNO to PossibleReaction(90, listOf(
            TextContent("Auguri tostone"),
        )),
        Topic.AMARCORD to PossibleReaction(75, listOf(
            TextContent("Ma come s'era tosti?"),
        )),
    ))
)
