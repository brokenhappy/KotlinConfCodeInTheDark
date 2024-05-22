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

@OptIn(ExperimentalResourceApi::class, ExperimentalLayoutApi::class)
@Composable
fun App() {
    MaterialTheme {
        FlowRow {
            Column {
                Box(Modifier.fillMaxHeight(.5f)) {
                    Image(painterResource(Res.drawable.kodee_waving), null)
                }
                Text(
                    text = "Hello",
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally),
                )
                Text(
                    text = " World!",
                    color = Color(red = 107, green = 48, blue = 255),
    //                color = Color(0xFF7954F6), // Alternative using ARGB
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                )
                TextField(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    value = "",
                    onValueChange = {},
                    placeholder = {
                        Text(modifier = Modifier.align(Alignment.CenterHorizontally), text = "Insert text here")
                    },
                )
                Button(
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    onClick = {},
                ) {
                    Text("Don't click me!")
                }
            }
        }
    }
}
























