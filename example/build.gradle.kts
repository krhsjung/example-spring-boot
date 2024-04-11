import kr.hs.jung.config.Configurations
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	alias(libs.plugins.springframework.boot)
	alias(libs.plugins.spring.dependency.management)
	alias(libs.plugins.jvm)
	alias(libs.plugins.plugin.spring)
}

group = Configurations.artifactGroup
version = Configurations.version

java {
	sourceCompatibility = Configurations.sourceCompatibility
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(libs.spring.boot.starter)
	implementation(libs.spring.boot.starter.data.web)
	implementation(libs.spring.boot.starter.data.jpa)
	implementation(libs.kotlin.reflect)
	testImplementation(libs.spring.boot.starter.test)

	// mariadb
	runtimeOnly(libs.mariadb.java.client)
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = Configurations.jvmTarget
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
