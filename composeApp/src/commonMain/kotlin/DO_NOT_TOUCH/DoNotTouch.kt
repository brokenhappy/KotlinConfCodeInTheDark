import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun AppPreview() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xFFCCCCCC)),
        ) {
            WebsiteView(
                modifier = Modifier
                    .aspectRatio(16 / 9f)
                    .weight(16 / 9f)
            ) {
                Content()
            }
            PhoneView(
                modifier = Modifier
                    .aspectRatio(94 / 197f)
                    .weight(94 / 197f),
            ) {
                Content()
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFCCCCCC)),
        )
    }
}

@Composable
fun Content() {
    Box(modifier = Modifier.fillMaxSize()) {
        App()
    }
}