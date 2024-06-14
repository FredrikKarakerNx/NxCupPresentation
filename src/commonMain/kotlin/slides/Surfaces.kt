package slides

import Body
import Title
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.spacedBy
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import bulletText
import net.kodein.cup.Slide
import net.kodein.cup.widgets.material3.BulletPoints
import nx_presentation.generated.resources.*
import nx_presentation.generated.resources.Res
import nx_presentation.generated.resources.complication
import nx_presentation.generated.resources.notification
import org.jetbrains.compose.resources.painterResource

val surfaces by Slide(
    stepCount = 2
) { step ->
    Title("Different UI surfaces")

    Spacer(Modifier.height(24.dp))

    AnimatedVisibility(
        step >= 1
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {

            Body("Watch face, Complication, Notification, Tile and App")

            Spacer(Modifier.height(24.dp))

            Row(horizontalArrangement = spacedBy(16.dp), verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painterResource(Res.drawable.complication),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                )
                Image(
                    painterResource(Res.drawable.notification),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                )
                Image(
                    painterResource(Res.drawable.tile),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                )
                Image(
                    painterResource(Res.drawable.app),
                    contentDescription = null,
                    modifier = Modifier
                        .size(100.dp)
                )
            }
        }
    }
}