package slides

import Title
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m3.TextWithNotoAnimatedEmoji
import org.kodein.emoji.smileys_emotion.face_glasses.FaceWithMonocle
import org.kodein.emoji.smileys_emotion.face_neutral_skeptical.FaceWithRaisedEyebrow

val cup by Slide {
    Title("What's the deal with these weird slides...?")
    Spacer(Modifier.height(16.dp))
    TextWithNotoAnimatedEmoji(
        text = "${Emoji.FaceWithRaisedEyebrow} ${Emoji.FaceWithMonocle}",
        style = MaterialTheme.typography.displayLarge,
    )
}
