import androidx.compose.foundation.layout.Column
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "CodeInTheDark",
    ) {
        App()
    }
}