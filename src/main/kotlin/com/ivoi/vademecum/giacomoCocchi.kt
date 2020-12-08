package com.ivoi.vademecum

import com.ivoi.Participant
import com.ivoi.actions.ActionTable
import com.ivoi.actions.PossibleAction
import com.ivoi.messages.TextContent
import com.ivoi.reactions.PossibleReaction
import com.ivoi.reactions.ReactionTable

val giacomoCocchi = Participant(
    "Giacomo",
    ActionTable(listOf(
        PossibleAction(5, listOf(
            TextContent("*Foto di montagna*\nMichi mi fa, babbo perché bevi alle sette di mattina?", Topic.MONTAGNA),
            TextContent("*Foto di montagna*", Topic.MONTAGNA),
        )),
        PossibleAction(5, listOf(
            TextContent("E' morto il grande Gervaso Spallanzoni", Topic.MORTO),
            TextContent("Addio Rinaldo", Topic.MORTO),
            TextContent("Oggi ci ha lasciato Romano Andreoli", Topic.MORTO),
            TextContent("E se ne va anche Dario Vargini, storico direttore del Manifesto", Topic.MORTO),
            TextContent("Ciao Stephen", Topic.MORTO),
        )),
        PossibleAction(5, listOf(
            TextContent("*Foto di un bicchiere di vino*", Topic.MANGIARE),
            TextContent("*Foto di un panino al lampredotto*\nOggi è andata così", Topic.MANGIARE),
            TextContent("*Foto di una bottiglia di amaro*\nLa Silvia oggi non c'è...", Topic.MANGIARE),
            TextContent("*Foto di una fetta di pane*", Topic.MANGIARE),
        )),
        PossibleAction(5, listOf(
            TextContent("*Foto di un politico femmina*\nLei è molto brava", Topic.DONNA),
            TextContent("*Foto di una ####*\nUna mia collega", Topic.DONNA),
        )),
        PossibleAction(5, listOf(
            TextContent("Ma come sarebbe uscire stasera?", Topic.USCIRE),
            TextContent("Stasera è la serata degli undicisti", Topic.USCIRE),
        )),
        PossibleAction(3, listOf(
            TextContent("Auguri a un super tosto", Topic.COMPLEANNO),
            TextContent("Auguri a chi sappiamo!!!!", Topic.COMPLEANNO),
        )),
        PossibleAction(5, listOf(
            TextContent("Fisco: addizionali Irpef +52% in 10 anni, top Roma e Lazio", Topic.NOTIZIA),
            TextContent("Everest 'cresciuto' di 86 cm, nuova misurazione Nepal-Cina", Topic.NOTIZIA),
            TextContent("Bonafede, task force anti corruzione sui fondi del Recovery. Ma Italia viva protesta", Topic.NOTIZIA),
            TextContent("Recovery fund, è stallo. Salta il cdm previsto nel pomeriggio. Renzi: No al piano di Conte. Rottura? Temo di si", Topic.NOTIZIA),
        )),
        PossibleAction(5, listOf(
            TextContent("*Foto di noi in montagna*\nMa come eravamo belli?", Topic.AMARCORD),
            TextContent("*Foto di noi in montagna*\nPaolo ti ricordi la cameriera? Ma com'era la cameriera?", Topic.AMARCORD),
        )),
    )),
    ReactionTable(hashMapOf(
        Topic.MONTAGNA to PossibleReaction(50, listOf(
            TextContent("❤"),
        )),
        Topic.MANGIARE to PossibleReaction(50, listOf(
            TextContent("❤❤"),
        )),
        Topic.MORTO to PossibleReaction(15, listOf(
            TextContent("Spina, non era un eroe della tua generazione"),
        )),
        Topic.DONNA to PossibleReaction(75, listOf(
            TextContent("Giuà ha ######## di meglio"),
            TextContent("E' molto brava"),
        )),
        Topic.USCIRE to PossibleReaction(75, listOf(
            TextContent("Combatto"),
            TextContent("Metto a letto Miche poi vedo"),
        )),
        Topic.COMPLEANNO to PossibleReaction(90, listOf(
            TextContent("Auguri"),
        )),
        Topic.AMARCORD to PossibleReaction(90, listOf(
            TextContent("Siamo i Meglio"),
            TextContent("❤❤❤❤❤❤❤"),
        )),
    ))
)
