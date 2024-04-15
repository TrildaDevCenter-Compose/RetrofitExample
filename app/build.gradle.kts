plugins {
    id ("com.android.application")
    id ("org.jetbrains.kotlin.android")
    id ("com.google.dagger.hilt.android")
    id ("com.google.devtools.ksp")
}

android {
    namespace =  "com.lj.app"
    compileSdk=  33

    defaultConfig {
        applicationId = "com.lj.retrofitexample"
        minSdk= 31
        targetSdk =33
        versionCode =1
        versionName ="1.0"

        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        getByName("release") {
            // Enables code shrinking, obfuscation, and optimization for only
            // your project's release build type. Make sure to use a build
            // variant with `isDebuggable=false`.
            isMinifyEnabled = true

            // Enables resource shrinking, which is performed by the
            // Android Gradle plugin.
            isShrinkResources = true

            // Includes the default ProGuard rules files that are packaged with
            // the Android Gradle plugin. To learn more, go to the section about
            // R8 configuration files.
            proguardFiles(
                    getDefaultProguardFile("proguard-android-optimize.txt"),
                    "proguard-rules.pro"
            )
            getByName("debug") {
                applicationIdSuffix = ".debug"
                isDebuggable = true
            }
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }

    buildFeatures {
        compose  = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.8"
    }
    packagingOptions{
        // The Rome library JARs embed some internal utils libraries in nested JARs.
        // We don't need them so we exclude them in the final package.
        //excludes += "/*.jar"

        // Multiple dependency bring these files in. Exclude them to enable
        // our test APK to build (has no effect on our AARs)
        resources.excludes.add ( "/META-INF/AL2.0")
        resources.excludes.add ("/META-INF/LGPL2.1")
    }
}

dependencies {
    implementation (project(":data"))
    implementation (project(":domain"))

    implementation ("androidx.core:core-ktx::1.12.0")
    implementation( "androidx.lifecycle:lifecycle-runtime-ktx:2.7.0")
    implementation( "androidx.activity:activity-compose:1.8.2")


    implementation(platform("androidx.compose:compose-bom:2024.03.00"))

    implementation( "androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation( "androidx.compose.material:material")
    implementation("androidx.lifecycle:lifecycle-viewmodel-compose:2.7.0")

    // Foundation (Border, Background, Box, Image, Scroll, shapes, animations, etc.)
    implementation ("androidx.compose.foundation:foundation")

    debugImplementation ("androidx.compose.ui:ui-tooling:")
    debugImplementation ("androidx.compose.ui:ui-test-manifest:1.6.5")

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