package science.mengxin.kotlinspring.controllers

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import science.mengxin.kotlinspring.domains.Note
import java.util.*

/**
 * User:    mengxin
 * Date:    2019-07-23
 * Project: kotlin-spring
 * Package: science.mengxin.kotlinspring.controllers
 * Description: NoteController.
 * @author mengxin
 * @version 1.0
 */

@RestController
@RequestMapping("/notes")
@EnableAutoConfiguration
class NoteController {
    @GetMapping(value = ["/obtain"], produces = [MediaType.APPLICATION_JSON_VALUE])
    fun getNotes(): List<Note> {
        return listOf(
                Note(
                        UUID.randomUUID().toString(),
                        "My first note",
                        "This is a message for the 1st note."),
                Note(
                        UUID.randomUUID().toString(),
                        "My second note",
                        "This is a message for the 2nd note."))
    }
}
