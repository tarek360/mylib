plugins {
    id("maven-publish")
    id("com.jfrog.bintray") version "1.7.3"
}
buildscript {
    val kotlinVersion = "1.2.60"
    repositories {
        mavenLocal()
        google()
        jcenter()
    }
    dependencies {
        classpath(kotlin("gradle-plugin", version = kotlinVersion))
    }
}

allprojects {
    repositories {
        mavenLocal()
        google()
        jcenter()
    }
}

