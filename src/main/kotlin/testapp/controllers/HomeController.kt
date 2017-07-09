package testapp.controllers

import org.jetbrains.ktor.http.ContentType
import org.jetbrains.ktor.response.respondText
import org.jetbrains.ktor.routing.Route
import org.jetbrains.ktor.routing.get

fun Route.homeController() {
    get("/") {
        call.respondText("HOME!", ContentType.Text.Html)
    }
    get("/test") {
        call.respondText("TEST!", ContentType.Text.Html)
    }
}
