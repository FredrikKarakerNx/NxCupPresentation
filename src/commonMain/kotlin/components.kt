import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import net.kodein.cup.widgets.foundation.BulletPointsBuilder

@Composable
public fun Title(
    text: String,
) {
    Text(
        text,
        style = MaterialTheme.typography.displayLarge,
        color = MaterialTheme.colorScheme.onBackground
    )
}

@Composable
public fun Body(
    text: String,
) {
    Text(
        text,
        style = MaterialTheme.typography.bodyLarge,
        color = MaterialTheme.colorScheme.onBackground
    )
}

public fun BulletPointsBuilder.bulletText(
    currentStep: Int,
    step: Int,
    text: String,
) {
    BulletPoint(visible = currentStep >= step) {
        Text(
            text = text,
            color = MaterialTheme.colorScheme.onBackground,
            style = MaterialTheme.typography.bodyLarge
        )
    }

}