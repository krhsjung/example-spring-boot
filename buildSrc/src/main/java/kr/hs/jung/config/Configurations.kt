package kr.hs.jung.config

import org.gradle.api.JavaVersion

object Configurations {
    const val artifactGroup = "kr.hs.jung.spring.example"

    private const val majorVersion = 0
    private const val minorVersion = 0
    private const val patchVersion = 1
    const val version = "$majorVersion.$minorVersion.$patchVersion"

    const val jvmTarget = "17"
    val sourceCompatibility = JavaVersion.VERSION_17
}
