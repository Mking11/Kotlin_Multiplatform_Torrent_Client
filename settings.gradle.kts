pluginManagement {
    repositories {
        google()
        gradlePluginPortal()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
    
}
rootProject.name = "Kotlin_Torrent_Multiplatform"


include(":Kttorent")
include(":desktop")
include(":common")

