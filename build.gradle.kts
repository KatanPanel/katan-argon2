import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.10"
}

group = "me.devnatan.katan.plugin.argon2"
version = "0.1.0"

repositories {
    mavenLocal()
    mavenCentral()
    jcenter()
    maven("https://jitpack.io")
}

dependencies {
    compileOnly(kotlin("stdlib"))
    compileOnly("me.devnatan.katan:api:0.0.1")
    implementation("de.mkammerer:argon2-jvm:2.7")
}

val fatJar = task("fatJar", type = Jar::class) {
    from(configurations.runtimeClasspath.get().map { if (it.isDirectory) it else zipTree(it) })
    with(tasks.jar.get() as CopySpec)
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
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