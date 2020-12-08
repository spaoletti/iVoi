package com.ivoi.vademecum

import com.ivoi.Participant
import com.ivoi.actions.ActionTable
import com.ivoi.actions.PossibleAction
import com.ivoi.messages.TextContent
import com.ivoi.reactions.PossibleReaction
import com.ivoi.reactions.ReactionTable

val andreaEvangelisti = Participant(
    "Eva",
    ActionTable(listOf(
        PossibleAction(5, listOf(
            TextContent("*Foto di ####*\nQuesta è per VOI vi LOVVO ahahahah", Topic.DONNA),
            TextContent("*Foto di ####*\nNo via dico solo NO VIA ######### ahahahah", Topic.DONNA),
            TextContent("*Foto di ####*\nCOLO questo è per te, ###### nel mio NOME", Topic.DONNA),
        )),
        PossibleAction(5, listOf(
            TextContent("Stasera vado con il mitico AleSSio a vedere suonare un nostro amico, chi viene di voi ToStiSSimi?"),
            TextContent("Annuncio che stasera c'è RITORNO AL FUTURO su rete 4"),
            TextContent("Vi amo Super Tosti"),
            TextContent("Cena da LAPO con il MiTiCo MESSICO"),
            TextContent("Dico solo CiGNAlE ahahahahah"),
        )),
    )),
    ReactionTable(hashMapOf(
        Topic.MONTAGNA to PossibleReaction(75, listOf(
            TextContent("Mitttttico"),
            TextContent("❤❤"),
            TextContent("ahahahahah"),
            TextContent("ahahahahahahahahahah"),
            TextContent("ahahahahahahahah"),
            TextContent("<<Questo messaggio è stato eliminato>>"),
        )),
        Topic.MANGIARE to PossibleReaction(75, listOf(
            TextContent("Tostissimo!!!!"),
            TextContent("❤❤❤❤"),
            TextContent("ahahahahahah"),
            TextContent("ahahahaahahahahahah"),
            TextContent("ahhahah"),
            TextContent("<<Questo messaggio è stato eliminato>>"),
        )),
        Topic.MORTO to PossibleReaction(25, listOf(
            TextContent("##### piango"),
            TextContent("Nooooooo"),
            TextContent("<<Questo messaggio è stato eliminato>>"),
        )),
        Topic.DONNA to PossibleReaction(100, listOf(
            TextContent("##### CHE ####"),
            TextContent("Sto #########"),
            TextContent("Colo questa è PER TE"),
            TextContent("ahahahahah"),
            TextContent("<<Questo messaggio è stato eliminato>>"),
        )),
        Topic.USCIRE to PossibleReaction(25, listOf(
            TextContent("Io devo ancora cenare #####"),
            TextContent("Adesso sono a ######. Forse dopo."),
            TextContent("Noooo ho già fissato con Alessio"),
            TextContent("<<Questo messaggio è stato eliminato>>"),
        )),
        Topic.COMPLEANNO to PossibleReaction(90, listOf(
            TextContent("Auguri Super Tosti!!"),
            TextContent("Auguri #####!"),
            TextContent("<<Questo messaggio è stato eliminato>>"),
        )),
    ))
)
