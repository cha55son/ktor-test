package testapp

import org.jetbrains.ktor.application.Application
import org.jetbrains.ktor.application.install
import org.jetbrains.ktor.routing.Routing
import testapp.controllers.homeController

fun Application.main() {
   install(Routing) {
       homeController()
   }
}
