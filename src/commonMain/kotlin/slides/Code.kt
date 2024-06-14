package slides

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import nx_presentation.generated.resources.Res
import nx_presentation.generated.resources.show_me_code
import org.jetbrains.compose.resources.painterResource
import org.kodein.emoji.Emoji
import org.kodein.emoji.compose.m3.TextWithNotoAnimatedEmoji
import org.kodein.emoji.smileys_emotion.face_glasses.NerdFace

val code by Slide {
    TextWithNotoAnimatedEmoji(
        text = "Where is the code?! ${Emoji.NerdFace}",
        style = MaterialTheme.typography.displayLarge,
    )
    Spacer(modifier = Modifier.height(24.dp))
    Image(
        painterResource(Res.drawable.show_me_code),
        contentDescription = null,
        modifier = Modifier
            .size(150.dp)
    )
}
