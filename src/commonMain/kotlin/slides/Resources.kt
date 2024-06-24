package slides

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.pointer.PointerIcon
import androidx.compose.ui.input.pointer.pointerHoverIcon
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m3.TextWithNotoAnimatedEmoji
import org.kodein.emoji.people_body.hand_fingers_open.Wave


val resources by Slide {

    TextWithNotoAnimatedEmoji(
        text = "That's it! ${Emoji.Wave}",
        style = MaterialTheme.typography.displayLarge,
    )

    Spacer(modifier = Modifier.height(24.dp))

    Text(
        "Resources",
        style = MaterialTheme.typography.bodyMedium,
        textDecoration = TextDecoration.Underline
    )

    Spacer(modifier = Modifier.height(16.dp))

    Column(Modifier.fillMaxWidth()) {

        Link(
            "Android Developers | Wear OS versus Mobile Development",
            "https://developer.android.com/training/wearables/wear-v-mobile"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Link(
            "Android Developers | Getting started designing for Wear OS",
            "https://developer.android.com/design/ui/wear/guides/foundations/getting-started"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Link(
            "Android Developers | Principles of Wear OS development",
            "https://developer.android.com/training/wearables/principles?continue=https://developer.android.com/courses/pathways/wear#article-https://developer.android.com/training/wearables/principles"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Link(
            "Android Developers | Use Jetpack Compose on Wear OS ",
            "https://developer.android.com/training/wearables/compose"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Link(
            "Android Developers | Handle Data Layer events on Wear",
            "https://developer.android.com/training/wearables/data/events"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Link(
            "Android Developers | Authentication on wearables",
            "https://developer.android.com/training/wearables/apps/auth-wear"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Link(
            "Google | Horologist",
            "https://google.github.io/horologist/"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Link(
            "KodeinKoders | CuP: Compose ur Pres",
            "https://kodeinkoders.github.io/CuP/CuP/1.0/index.html"
        )

        Spacer(modifier = Modifier.height(8.dp))

        Link(
            "GitHub | KodeinKoders - CuP-Presentation-Template",
            "https://github.com/KodeinKoders/CuP-Presentation-Template"
        )
    }
}

@Composable
private fun Link(
    text: String,
    url: String
) {
    val uriHandler = LocalUriHandler.current
    Text(
        text = text,
        color = MaterialTheme.colorScheme.primary,
        textDecoration = TextDecoration.Underline,
        style = MaterialTheme.typography.bodyLarge,
        modifier = Modifier
            .pointerHoverIcon(PointerIcon.Hand)
            .clickable {
                uriHandler.openUri(url)
            }
    )

}