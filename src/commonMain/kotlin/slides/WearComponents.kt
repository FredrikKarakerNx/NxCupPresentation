package slides

import Body
import Title
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.kodein.cup.PreparedSlide
import net.kodein.cup.sa.SourceCode
import net.kodein.cup.sa.SourceCodeThemes
import net.kodein.cup.sa.rememberSourceCode

val wearComponents by PreparedSlide(
    stepCount = 5
) {
    val imports = rememberSourceCode(language = "kotlin") {
        // language=kotlin 
        """
        import androidx.wear.compose.material.Button
        // vs
        import androidx.compose.material.Button
        """.trimIndent()

    }

    val components = rememberSourceCode(language = "kotlin") {
        // language=kotlin 
        """
        @Composable
        fun WearApp() {
            SwipeDismissableNavHost{
                ScalingLazyColumn{}
            }
         }
        """.trimIndent()

    }

    slideContent { step ->
        Title("Wear-specific components")

        AnimatedVisibility(step >= 1) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Spacer(Modifier.height(24.dp))
                Body(text = "• Possible to use regular material components but should be avoided")
                Spacer(Modifier.height(8.dp))
                SourceCode(imports, theme = SourceCodeThemes.darcula, modifier = Modifier.padding(start = 16.dp))
            }
        }
        AnimatedVisibility(step >= 2) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Spacer(Modifier.height(8.dp))
                Body(text = "• Some special components")
                Spacer(Modifier.height(8.dp))
                SourceCode(components, theme = SourceCodeThemes.darcula, modifier = Modifier.padding(start = 16.dp))
            }
        }
        AnimatedVisibility(step >= 3) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Spacer(Modifier.height(8.dp))
                Body(text = "• Slightly different theming classes and only dark mode")
            }
        }
        AnimatedVisibility(step >= 4) {
            Column(modifier = Modifier.fillMaxWidth()) {
                Spacer(Modifier.height(8.dp))
                Body(text = "• Rotary input for scrolling")
            }
        }
    }
}