import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}

group = "me.devnatan.katan.plugin.argon2"
version = "0.1.0"

repositories {
    mavenCentral()
    jcenter()
    maven("https://jitpack.io")
}

dependencies {
    compileOnly(kotlin("stdlib"))
    compileOnly("com.github.KatanPanel:Katan:a5040bb479")
    implementation("de.mkammerer:argon2-jvm:2.7")
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xopt-in=kotlin.RequiresOptIn")
            jvmTarget = "1.8"
        }
    }

    withType<Jar> {
        manifest {
            attributes["Implementation-Version"] = archiveVersion
        }
        archiveBaseName.set("${project.name}-all")
        from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    }
}