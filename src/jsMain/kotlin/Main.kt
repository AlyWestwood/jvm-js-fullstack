import kotlinx.browser.document
import react.dom.render
import react.create

fun main() {
    val container = document.getElementById("root")?: error("Could find container")
    render(App.create(), container)
}
