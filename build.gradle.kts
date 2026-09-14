import java.util.Properties

plugins {
    id("java")
    `java-library`
}

group = "io.github.r2turntrue"
version = "0.1.6"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")

    implementation("org.jetbrains:annotations:24.1.0")
    implementation("com.squareup.okhttp3:okhttp:4.12.0")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("org.java-websocket:Java-WebSocket:1.5.5")
    implementation("org.seleniumhq.selenium:selenium-java:4.26.0")
    implementation("io.socket:socket.io-client:1.0.2")
}

tasks.test {
    enabled = false
    useJUnitPlatform()
}

tasks.compileJava {
    options.encoding = "UTF-8"
}

tasks.javadoc {
    options.encoding = "UTF-8"
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(16))
    }
    withJavadocJar()
    withSourcesJar()
}

object Meta {
    val COMPONENT_TYPE = "java" // "java" or "versionCatalog"
    val GROUP = "io.github.r2turntrue"
    val ARTIFACT_ID = "chzzk4j"
    val VERSION = "0.1.6"
    val PUBLISHING_TYPE = "AUTOMATIC" // USER_MANAGED or AUTOMATIC
    val SHA_ALGORITHMS = listOf("SHA-256", "SHA-512") // sha256 and sha512 are supported but not mandatory. Only sha1 is mandatory but it is supported by default.
    val DESC = "Unofficial Java API library of CHZZK (치지직, the video streaming service of Naver)"
    val LICENSE = "MIT License"
    val LICENSE_URL = "https://opensource.org/license/mit/"
    val GITHUB_REPO = "R2turnTrue/chzzk4j.git"
    val DEVELOPER_ID = "R2turnTrue"
    val DEVELOPER_NAME = "R2turnTrue"
    val DEVELOPER_ORGANIZATION = "R2turnTrue"
    val DEVELOPER_ORGANIZATION_URL = "https://github.com/R2turnTrue"
}