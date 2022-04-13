rootProject.name = "android_sample_dsl"
include(":app")

enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        google()
    }

    versionCatalogs {
        create("customLibs") {
            from(files("gradle/libs.versions.toml"))
        }
    }
}