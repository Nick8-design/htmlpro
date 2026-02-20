plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)

    id("org.jetbrains.kotlin.plugin.serialization") version "2.2.10"
    id("com.google.dagger.hilt.android")
    id("com.google.devtools.ksp")
}

android {
    namespace = "com.nickdieda.htmlpro"
    compileSdk = 36

    defaultConfig {
        applicationId = "com.nickdieda.javascript"
        minSdk = 24
        targetSdk = 36
        versionCode = 2
        versionName = "1.1"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17

        isCoreLibraryDesugaringEnabled = true
    }
    kotlinOptions {
        jvmTarget = "17"
    }
    buildFeatures {
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
//    implementation(libs.androidx.documentfile)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation("androidx.documentfile:documentfile:1.1.0")


    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.1.4")

    implementation("io.github.Rosemoe.sora-editor:editor:0.23.6")
    implementation("io.github.Rosemoe.sora-editor:language-textmate:0.23.6")


    implementation("com.airbnb.android:lottie-compose:6.0.0")

    //fonts
    implementation("androidx.compose.ui:ui-text-google-fonts:1.5.3")


    //navigation
    implementation("androidx.navigation:navigation-compose:2.7.4")


    implementation("androidx.lifecycle:lifecycle-runtime-compose:2.9.2")

//    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.9.0")


    implementation("androidx.compose.material:material-icons-extended:1.7.8")


    implementation("androidx.core:core-splashscreen:1.0.1")

    implementation("androidx.work:work-runtime-ktx:2.10.4")

//    implementation("com.google.firebase:firebase-auth-ktx:24.0.1")



    //Dagger-Hilt
    val dagger ="2.57.1"
    implementation("com.google.dagger:hilt-android:$dagger")
    ksp("com.google.dagger:hilt-android-compiler:$dagger")
    ksp("androidx.hilt:hilt-compiler:1.2.0")
    implementation("androidx.hilt:hilt-navigation-compose:1.2.0")

    //datastore
    implementation("androidx.datastore:datastore-preferences:1.1.1")


//    implementation("com.google.android.exoplayer:exoplayer:2.19.1")

    //ads
//    implementation("com.google.android.gms:play-services-ads:24.8.0")
//    implementation ("com.google.android.gms:play-services-ads-identifier:18.2.0")


    // MediaPipe for Offline LLM (Summarization)
//    implementation("com.google.mediapipe:tasks-genai:0.10.14")

    // Whisper TFLite for Offline STT (Transcription)
    // You can use a wrapper library like 'com.github.whisper-tflite'
//    implementation("com.google.mediapipe:tasks-audio:0.10.14")

    // Whisper TFLite for Offline STT
//    implementation("com.github.Gheru:whisper.tflite:1.0.1")
//    implementation("com.alphacephei:vosk-android:0.3.32")


    // This fixes the 'Cannot access PointerType' error
//    implementation("net.java.dev.jna:jna:5.13.0@aar")



}