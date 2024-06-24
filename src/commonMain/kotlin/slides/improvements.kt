package slides

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import bulletText
import net.kodein.cup.Slide
import net.kodein.cup.widgets.material3.BulletPoints
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m3.TextWithNotoAnimatedEmoji
import org.kodein.emoji.travel_places.transport_air.Rocket

val improvements by Slide(
    stepCount = 5
) { step ->
    TextWithNotoAnimatedEmoji(
        text = "Things to do before production ${Emoji.Rocket}",
        style = MaterialTheme.typography.displayLarge,
    )

    Spacer(Modifier.height(24.dp))

    BulletPoints {
        bulletText(
            currentStep = step,
            step = 1,
            text = "Show all library lists (including recents and downloads)",
        )
        bulletText(
            currentStep = step,
            step = 2,
            text = "Standalone sign-in with OAuth 2.0 or Google",
        )
        bulletText(
            currentStep = step,
            step = 3,
            text = "Choosing/pairing a bluetooth device when starting playback",
        )
        bulletText(
            currentStep = step,
            step = 4,
            text = "Have a look at Spotify and Bookbeat...",
        )
    }
}