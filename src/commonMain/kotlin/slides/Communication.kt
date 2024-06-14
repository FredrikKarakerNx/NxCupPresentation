package slides

import Body
import Title
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import net.kodein.cup.ui.styled

val communication by Slide(
    stepCount = 5
) { step ->
    Title("Communicate with mobile app")

    AnimatedVisibility(step >= 1) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Spacer(Modifier.height(24.dp))
            Text(
                text = styled { "• Send and sync data/events using ${+b}DataClient${-b} and ${+b}MessageClient${-b}" },
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onBackground
            )
        }
    }
    AnimatedVisibility(step >= 2) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Spacer(Modifier.height(8.dp))
            Body(
                text = "• Uses Bluetooth or Google Cloud Sync"
            )
        }
    }

    AnimatedVisibility(step >= 3) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Spacer(Modifier.height(8.dp))
            Body(
                text = "• Should not be used to transfer large amount of data"
            )
        }
    }

    AnimatedVisibility(step >= 4) {
        Column(modifier = Modifier.fillMaxWidth()) {
            Spacer(Modifier.height(8.dp))
            Body(
                text = "• End-to-end encrypted, package names and signature must match"
            )
        }
    }

}