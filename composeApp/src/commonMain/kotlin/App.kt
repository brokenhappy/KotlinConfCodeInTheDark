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

const val teamName = "Unnamed contestant!"

@OptIn(ExperimentalResourceApi::class, ExperimentalLayoutApi::class)
@Composable
fun App() {
    MaterialTheme {
        FlowRow(modifier = Modifier.padding(16.dp).fillMaxSize()) {
            Image(painterResource(Res.drawable.kodee_waving), null)
            Text("Hello World!", modifier = Modifier.align(Alignment.CenterVertically))
        }
    }
}
























