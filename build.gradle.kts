plugins {
    java
}

repositories {
    mavenCentral()
}

val guavaVersion = "32.0.1-jre"
val nettyVersion = "4.1.124.Final"

dependencies {

    // SHOULD be detected in most systems
    implementation("com.google.guava:guava:$guavaVersion")

    // OFTEN MISSED in buggy parsers (this is your key test)
    implementation("io.netty", "netty-handler", nettyVersion)
    implementation("org.bouncycastle", "bcprov-jdk18on", "1.84")
}
