package slides

import Title
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import bulletText
import net.kodein.cup.Slide
import net.kodein.cup.widgets.material3.BulletPoints

val simple by Slide(
    stepCount = 4
) { step ->

    Title("Keep it simple!")

    Spacer(Modifier.height(24.dp))

    BulletPoints {
        bulletText(
            currentStep = step,
            step = 1,
            text = "Small feature set",
        )
        bulletText(
            currentStep = step,
            step = 2,
            text = "Shallow navigation tree",
        )
        bulletText(
            currentStep = step,
            step = 3,
            text = "Tasks should be completable within seconds",
        )
    }
}