pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        maven {
            setUrl("https://maven.google.com")
        }
        maven {
            setUrl("https://plugins.gradle.org/m2/")
        }

    }

}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            setUrl("https://maven.google.com")
        }
        maven {
            setUrl("https://plugins.gradle.org/m2/")
        }
    }
}

rootProject.name = "Android Sample GRPC"
include(":app")
 