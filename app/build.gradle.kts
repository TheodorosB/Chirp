plugins {
	id("chirp.spring-boot-app")
}

group = "com.tbonis"
version = "0.0.1-SNAPSHOT"

dependencies {
	implementation(projects.chat)
	implementation(projects.user)
	implementation(projects.notification)
	implementation(projects.common)

	implementation(libs.kotlin.reflect)
	implementation(libs.spring.boot.starter.security)

	implementation(libs.spring.boot.starter.data.jpa)
	runtimeOnly(libs.postgresql)
}
