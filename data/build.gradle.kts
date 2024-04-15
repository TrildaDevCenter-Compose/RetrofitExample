plugins {
    id ("com.android.library")
    id ("org.jetbrains.kotlin.android")
    id ("com.google.dagger.hilt.android")
    id ("com.google.devtools.ksp")
}

android {
    namespace = "com.lj.libraryexample"
    compileSdk=  33

    defaultConfig {
        minSdk= 31
        targetSdk = 33
    }

    buildTypes {
        getByName("release") {
            // Enables code shrinking, obfuscation, and optimization for only
            // your project's release build type. Make sure to use a build
            // variant with `isDebuggable=false`.
            isMinifyEnabled = true

            // Includes the default ProGuard rules files that are packaged with
            // the Android Gradle plugin. To learn more, go to the section about
            // R8 configuration files.
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }}

dependencies {
    implementation ("androidx.core:core-ktx::1.12.0")
    implementation ("androidx.appcompat:appcompat:1.6.1")

    implementation(platform("androidx.compose:compose-bom:2024.03.00"))

    implementation( "androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation( "androidx.compose.material:material")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose")

    // Hilt dependencies
    val hiltVersion = "2.51.1"
    implementation ("com.google.dagger:hilt-android:$hiltVersion")
    ksp ("com.google.dagger:hilt-compiler:$hiltVersion")

    implementation ("androidx.hilt:hilt-navigation-compose:1.2.0")
    implementation ("androidx.hilt:hilt-work:1.2.0")

    // Retrofit
    implementation ("com.squareup.retrofit2:retrofit:2.11.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.11.0")

    implementation(platform("com.squareup.okhttp3:okhttp-bom:4.12.0"))
    // define any required OkHttp artifacts without version
    implementation("com.squareup.okhttp3:okhttp")
    implementation("com.squareup.okhttp3:logging-interceptor")
}