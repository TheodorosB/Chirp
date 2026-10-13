import gradle.kotlin.dsl.accessors._d6c479abfbcaddf96d737ef8e50749a2.allOpen
import gradle.kotlin.dsl.accessors._d6c479abfbcaddf96d737ef8e50749a2.java
import org.gradle.jvm.toolchain.JavaLanguageVersion
import org.gradle.kotlin.dsl.kotlin

plugins {
    id("chirp.spring-boot-service")
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

allOpen {
    annotation("javax.persistence.Entity")
    annotation("javax.persistence.MappedSuperclass")
    annotation("javax.persistence.Embeddable")
}