import androidx.compose.animation.*
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.material.icons.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.*
import androidx.compose.ui.text.font.*
import androidx.compose.ui.unit.*
import codeinthedark.composeapp.generated.resources.*
import org.jetbrains.compose.resources.*
import org.jetbrains.compose.ui.tooling.preview.Preview

const val teamName = "Unnamed contestant!"


@Composable
@OptIn(ExperimentalResourceApi::class, ExperimentalLayoutApi::class)
fun App() {
    MaterialTheme {
        FlowRow(modifier = Modifier.padding(8.dp)) {
            Image(painterResource(Res.drawable.kodee_waving), null)
            Text(text = "Hello World!", modifier = Modifier.align(Alignment.CenterVertically))
        }
    }
}

@Composable
@OptIn(ExperimentalResourceApi::class)
@Suppress("unused")
fun ExampleApisForYouToCopyFrom() {
    Box(Modifier.fillMaxHeight(.5f)) {
        Image(painterResource(Res.drawable.kodee_waving), null)
    }
    Text(text = "Hello World!", color = Color(red = 107, green = 48, blue = 255))
    Text(text = "Hello World!", color = Color(0xFF7954F6))
    TextField(
        value = "",
        onValueChange = {},
        placeholder = {
            Text(text = "Insert text here")
        },
    )
    Button(onClick = {}) {
        Text("Don't click me!")
    }
}






















