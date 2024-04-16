buildscript {

    extra["androix_core"] = "1.12.0"
    extra["androix_appcompat"] = "1.6.1"
    extra["androix_lifecycle"] = "2.3.1"
    extra["kotlin_version"] = "1.9.23"
    extra["compose_version"] = "1.5.11"
    extra["activity_compose_version"] = "1.7.2"
    extra["hilt_version"] = "2.51.1"
    extra["nav_compose_version"] = "1.0.0"
    extra["retrofit2"] = "2.11.0"
    extra["okhttp3"] = "4.12.0"
}

plugins {
    id ("com.android.application") version "8.3.0" apply false
    id ("com.android.library" )version "8.3.0" apply false
    id ("org.jetbrains.kotlin.android") version "1.9.23" apply false
    id ("org.jetbrains.kotlin.jvm") version "1.9.23" apply false
    id ("com.google.dagger.hilt.android") version "2.51.1" apply false
    id ("com.google.devtools.ksp") version "1.9.23-1.0.20" apply false
}