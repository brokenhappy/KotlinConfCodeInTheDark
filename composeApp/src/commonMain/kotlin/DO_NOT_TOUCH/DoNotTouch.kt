import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun AppPreview() {
    Row(Modifier.fillMaxSize()) {
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
}

@Composable
fun Content() {
    Box(modifier = Modifier.fillMaxSize()) {
        App()
    }
}