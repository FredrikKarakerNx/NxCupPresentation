plugins {
    kotlin("multiplatform") version "2.0.0"
    kotlin("plugin.compose") version "2.0.0"
    id("org.jetbrains.compose") version "1.6.10"
    id("net.kodein.cup") version "1.0.0-Beta-04"
}

cup {
    targetDesktop()

    // TODO: If you comment this (you don't want to export your presentation as a web page),
    //  you must remove the .github/workflows/pages.yml file as well.
    // targetWeb()
}

kotlin {
    sourceSets.commonMain {
        dependencies {
            // Includes Source Code highlighting & animations.
            implementation(cup.sourceCode)

            // TODO: Select plugins (comment or uncomment function of your needs)

            // Secondary window with preview & speaker notes.
            implementation(cup.plugin.speakerWindow)

            // Allows to draw over the presentation on the main window.
            // This tool is also part of the Speaker Mode window.
            implementation(cup.plugin.laser)
            implementation(compose.material3)
            implementation(cup.widgets.material3)
            implementation("org.kodein.emoji:emoji-compose-m3:2.0.1")
        }
    }
}
