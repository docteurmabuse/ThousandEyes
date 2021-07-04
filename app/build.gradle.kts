plugins {
    id("com.android.application")
    id("kotlin-android")
    id ("kotlin-kapt")
    id ("dagger.hilt.android.plugin")
}

android {
    compileSdk = 30
    buildToolsVersion = "30.0.3"

    defaultConfig {
        applicationId = "com.example.thousandeyes"
        minSdk = 21
        targetSdk = 30
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
        useIR = true
    }
    buildFeatures {
        compose = true
    }
    composeOptions {
        kotlinCompilerExtensionVersion = rootProject.extra["compose_version"] as String
        kotlinCompilerVersion = "1.4.32"
    }
}

dependencies {

    implementation("androidx.core:core-ktx:1.6.0")
    implementation("androidx.appcompat:appcompat:1.3.0")
    implementation("com.google.android.material:material:1.4.0")

    implementation("androidx.compose.ui:ui:${rootProject.extra["compose_version"]}")
    implementation("androidx.compose.material:material:${rootProject.extra["compose_version"]}")
    implementation("androidx.compose.ui:ui-tooling:${rootProject.extra["compose_version"]}")
    implementation("androidx.activity:activity-compose:1.3.0-rc01")
    implementation ("androidx.compose.foundation:foundation:${rootProject.extra["compose_version"]}")
    implementation ("androidx.compose.runtime:runtime-livedata:${rootProject.extra["compose_version"]}")
    implementation ("androidx.compose.material:material-icons-core:${rootProject.extra["compose_version"]}")
    implementation ("androidx.compose.material:material-icons-extended:${rootProject.extra["compose_version"]}")


    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")


    implementation ("androidx.navigation:navigation-fragment-ktx:2.3.5")
    implementation ("androidx.navigation:navigation-ui-ktx:2.3.5")

    implementation ("com.squareup.retrofit2:retrofit:2.9.0")
    implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

    implementation ("com.google.dagger:hilt-android:2.37")
    "kapt" ("com.google.dagger:hilt-compiler:2.37")

    implementation ("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")

    // enables constructor injection into viewmodels used in composables
    implementation ("androidx.hilt:hilt-navigation:1.0.0")

    implementation ("com.github.bumptech.glide:glide:4.12.0")
   "kapt" ("com.github.bumptech.glide:compiler:4.12.0")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
    androidTestImplementation("androidx.compose.ui:ui-test-junit4:${rootProject.extra["compose_version"]}")
}