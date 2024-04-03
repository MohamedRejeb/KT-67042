import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlurEffect
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    LaunchedEffect(Unit) {
        convertRadiusToSigma(10f)
    }

    MaterialTheme {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Text("Hey")
        }
    }
}

fun convertRadiusToSigma(radius: Float): Float =
    BlurEffect.convertRadiusToSigma(radius)