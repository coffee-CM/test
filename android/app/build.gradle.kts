plugins {
    id("com.android.application")
}

android {
    namespace = "com.kgtech.university"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.kgtech.university"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    sourceSets.getByName("main").assets {
        srcDir(rootProject.file("../"))
        include("index.html", "code1.html", "screen.png")
    }
}
