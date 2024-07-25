plugins {
    id("org.springframework.boot") version "3.3.0"
    id("io.spring.dependency-management") version "1.1.5"
    kotlin("jvm") version "1.9.24"
    kotlin("plugin.spring") version "1.9.24"
    kotlin("plugin.serialization").version("1.9.10")
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

val ktorVersion = "2.3.7"
dependencies {
//    implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
//    implementation("org.springframework.boot:spring-boot-starter-jdbc")
//    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//    implementation("org.jetbrains.kotlin:kotlin-reflect")
//    implementation("org.liquibase:liquibase-core")
//    implementation("org.springframework.kafka:spring-kafka")
//    runtimeOnly("org.postgresql:postgresql")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")
//    testImplementation("org.springframework.boot:spring-boot-testcontainers")
//    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
//    testImplementation("org.springframework.kafka:spring-kafka-test")
//    testImplementation("org.testcontainers:junit-jupiter")
//    testImplementation("org.testcontainers:kafka")
//    testImplementation("org.testcontainers:postgresql")
//    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("io.ktor:ktor-client-serialization:$ktorVersion")
    implementation("io.ktor:ktor-client-core:$ktorVersion")
    implementation("io.ktor:ktor-client-content-negotiation:$ktorVersion")
    implementation("io.ktor:ktor-serialization-kotlinx-json:$ktorVersion")
//
//    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
//    implementation("org.springframework.boot:spring-boot-starter-web")
//    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
//    implementation("org.jetbrains.kotlin:kotlin-reflect")
//    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
//    developmentOnly("org.springframework.boot:spring-boot-devtools")
//    runtimeOnly("com.h2database:h2")
//    testImplementation("org.springframework.boot:spring-boot-starter-test")

        implementation("org.springframework.boot:spring-boot-starter")
        implementation("org.springframework.boot:spring-boot-starter-web")
        implementation("io.ktor:ktor-client-cio:$ktorVersion")
        implementation("io.ktor:ktor-client-logging:$ktorVersion")
        implementation("ch.qos.logback:logback-classic:1.4.14")
        implementation("org.jetbrains.kotlin:kotlin-reflect")
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
