plugins {
    groovy
    java
    kotlin("jvm") version "1.4.0"
}

group = "com.cain.ds"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    compile("org.codehaus.groovy:groovy-all:2.3.11")
    implementation(kotlin("stdlib"))
    testCompile("junit", "junit", "4.12")
}
