plugins {
  id("org.jetbrains.kotlin.jvm") version "1.4.10"
  `java-library`
}

group = "org.matheclipse"
version = "0.1-SNAPSHOT"

repositories {
  mavenCentral()
  maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
  implementation(platform("org.jetbrains.kotlin:kotlin-bom"))
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
  implementation("org.matheclipse:matheclipse-core:1.0.0-SNAPSHOT")
  testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}