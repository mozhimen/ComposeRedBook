plugins {
    alias(libs.plugins.redBook.android.feature)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.loren.redbook.home"

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    implementation(projects.feature.base)
    implementation(projects.core.data)
    implementation(libs.coil.compose)
    implementation(projects.theme)
    implementation(libs.androidx.paging.compose)
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.gson)
    implementation(libs.androidx.compose.animation)
}