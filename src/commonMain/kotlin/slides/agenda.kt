package slides

import Title
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.animation.expandVertically
import androidx.compose.animation.scaleIn
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import net.kodein.cup.widgets.material3.BulletPoints
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m3.TextWithNotoAnimatedEmoji
import org.kodein.emoji.smileys_emotion.face_hand.ThinkingFace

val agenda by Slide(
    stepCount = 5
) { step ->

    Title("Agenda")

    Spacer(Modifier.height(24.dp))

    BulletPoints {
        BulletPoint(visible = step >= 1) {
            Text(
                text = "Developing for Wear OS",
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.bodyLarge
            )
        }
        BulletPoint(visible = step >= 2) {
            Text(
                text = "Show me the code!",
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.bodyLarge
            )
        }
        BulletPoint(visible = step >= 3) {
            Text(
                text = "Release to production - What's left?",
                color = MaterialTheme.colorScheme.onBackground,
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }

    AnimatedVisibility(
        visible = step >= 4,
        enter = scaleIn(
            spring(
                Spring.DampingRatioHighBouncy,
                Spring.StiffnessMediumLow
            )
        ) + expandVertically(clip = false)
    ) {
        TextWithNotoAnimatedEmoji(
            text = "How was this presentation made... ${Emoji.ThinkingFace}",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(top = 16.dp)
        )
    }

}