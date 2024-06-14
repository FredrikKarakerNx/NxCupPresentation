package slides

import Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import nx_presentation.generated.resources.Res
import net.kodein.cup.Slide
import nx_presentation.generated.resources.nextory
import nx_presentation.generated.resources.wear_player
import nx_presentation.generated.resources.wear_recents
import org.jetbrains.compose.resources.painterResource


val intro by Slide {
    Row(verticalAlignment = Alignment.Bottom) {
        Image(
            painterResource(Res.drawable.nextory),
            contentDescription = null,
            modifier = Modifier
                .padding(bottom = 1.dp)
                .height(20.dp),
            contentScale = ContentScale.FillHeight
        )
        Title(
            text = " on Wear OS",
        )
    }
    Spacer(Modifier.height(24.dp))
    Row {
        Image(
            painterResource(Res.drawable.wear_recents),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )
        Spacer(Modifier.width(16.dp))
        Image(
            painterResource(Res.drawable.wear_player),
            contentDescription = null,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )
    }
}
