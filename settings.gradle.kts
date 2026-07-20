rootProject.name = "vlc-setup"

// JitPack CI doesn't have JDK 25, skip linux plugin subproject
// includeBuild("vlc-plugins-linux")

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
