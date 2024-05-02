import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import codeinthedark.composeapp.generated.resources.Res
import codeinthedark.composeapp.generated.resources.iphone_15_pro_frame
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun PhoneView(modifier: Modifier, content: @Composable () -> Unit) {
    Box(
        modifier = Modifier
            .then(modifier)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.White)
        ) {
            Column {
                Spacer(modifier = Modifier.weight(17f))
                Box(modifier = Modifier.weight(177f)) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {
                        Row {
                            Spacer(modifier = Modifier.weight(4f))
                            Box(modifier = Modifier.weight(86f)) {
                                Box(modifier = Modifier.fillMaxSize()) {
                                    content()
                                }
                            }
                            Spacer(modifier = Modifier.weight(4f))
                        }
                    }
                }
                Box(modifier = Modifier.weight(3f))
            }
        }
        Image(
            painter = painterResource(Res.drawable.iphone_15_pro_frame),
            contentDescription = null,
            modifier = Modifier
                .fillMaxSize()
        )
    }
}