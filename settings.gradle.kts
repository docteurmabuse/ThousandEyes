dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Thousand Eyes"
include(":app")
include(":core")
include(":constants")
include(":movie")
include(":movie:movie-datasource")
include(":movie:movie-datasource-test")
include(":movie:movie-domain")
include(":movie:movie-interactors")
include(":movie:ui-movieList")
include(":movie:ui-movieDetail")

include(":components")
