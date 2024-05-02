import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.toSize
import codeinthedark.composeapp.generated.resources.Res
import codeinthedark.composeapp.generated.resources.compose_multiplatform
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource

@OptIn(ExperimentalResourceApi::class)
@Composable
fun WebsiteView(modifier: Modifier, content: @Composable () -> Unit) {
    Box(modifier = Modifier
        .background(Color.LightGray)
        .then(modifier)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
        ) {
            // Mac-style buttons
            Row {
                Row(
                    modifier = Modifier.padding(8.dp) // Padding around the buttons
                ) {
                    MacButton(color = Color(0xFFEB5160)) // Red close button
                    MacButton(color = Color(0xFFF2BD44)) // Yellow minimize button
                    MacButton(color = Color(0xFF35C759)) // Green maximize button
                }
                Row(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .background(Color.White)
                        .clip(RoundedCornerShape(bottomEnd = 8.dp))
                        .background(Color.LightGray)
                        .height(28.dp)
                        .width(8.dp)
                ) {}
                Row(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .clip(RoundedCornerShape(topEnd = 8.dp, topStart = 8.dp))
                        .height(28.dp)
                        .background(Color.White)
                        .padding(start = 4.dp, end = 16.dp)
                ) {
                    Image(painterResource(Res.drawable.compose_multiplatform), null)
                    Text(
                        text = "Preview of: $teamName",
                        modifier = Modifier
                            .align(Alignment.CenterVertically)
                            .padding(start = 8.dp),
                    )
                }
                Row(
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .background(Color.White)
                        .clip(RoundedCornerShape(bottomStart = 8.dp))
                        .background(Color.LightGray)
                        .height(28.dp)
                        .width(8.dp)
                ) {}
            }

            // Content container with white background and rounded corners
            Surface(
                modifier = Modifier
                    .padding(top = 0.dp, start = 8.dp, end = 8.dp, bottom = 8.dp) // Add padding around the content
                    .fillMaxHeight() // Fill the height
                    .weight(1f) // Take up remaining space
                    .clip(RoundedCornerShape(8.dp)), // Round the corners
                color = Color.White // White background for the content area
            ) {
                content()
            }
        }
    }
}

// Helper composable for the mac-style buttons
@Composable
fun MacButton(color: Color) {
    Box(
        modifier = Modifier
            .padding(4.dp)
            .size(12.dp)
            .clip(CircleShape)
            .background(color)
    )
}