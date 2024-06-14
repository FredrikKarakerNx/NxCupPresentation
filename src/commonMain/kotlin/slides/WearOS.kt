package slides

import Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.Slide
import nx_presentation.generated.resources.Res
import nx_presentation.generated.resources.wearos
import org.jetbrains.compose.resources.painterResource

val wearOS by Slide {
    Title(
        "Developing for Wear OS",
    )
    Image(
        painterResource(Res.drawable.wearos),
        contentDescription = null,
        modifier = Modifier
            .size(220.dp)
    )
}
