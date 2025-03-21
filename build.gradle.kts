plugins {
  java
  id("io.papermc.paperweight.userdev") version "2.0.0-beta.16"
}

dependencies {
  // Hosted on maven.radsteve.net, should be fetched from the
  // repos defined in the depResMgmt repo block
  implementation("net.radstevee.packed:packed-core:1.0.3")

  paperweight.paperDevBundle("1.21.4-R0.1-SNAPSHOT")
}
