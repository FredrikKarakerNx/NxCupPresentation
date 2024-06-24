package slides

import Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import bulletText
import net.kodein.cup.Slide
import net.kodein.cup.widgets.material3.BulletPoints
import nx_presentation.generated.resources.Res
import nx_presentation.generated.resources.horologist
import org.jetbrains.compose.resources.painterResource


val horologist by Slide(
    stepCount = 6
) { step ->

    Image(
        painterResource(Res.drawable.horologist),
        contentDescription = null,
        modifier = Modifier
            .height(65.dp),
        contentScale = ContentScale.FillHeight
    )

    Spacer(Modifier.height(24.dp))

    BulletPoints {
        bulletText(
            currentStep = step,
            step = 1,
            text = "Group of libraries from Google (same idea as accompanist but for Wear)",
        )
        bulletText(
            currentStep = step,
            step = 2,
            text = "Audio and UI",
        )
        bulletText(
            currentStep = step,
            step = 3,
            text = "Pre-built composables (date and time pickers etc.)",
        )
        bulletText(
            currentStep = step,
            step = 4,
            text = "Authentication",
        )

        bulletText(
            currentStep = step,
            step = 5,
            text = "And more...",
        )

    }
}