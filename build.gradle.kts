// Top-level build file where you can add configuration options common to all sub-projects/modules.
buildscript {
    repositories {
        google()
        jcenter()
        mavenLocal()
        maven {
            setUrl("https://maven.aliyun.com/repository/public/")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/google/")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/jcenter/")
        }
        maven {
            setUrl("https://maven.aliyun.com/nexus/content/groups/public/")
        }
        maven {
            setUrl("https://jitpack.io")
        }
        maven {
            setUrl("https://jcenter.bintray.com/")
        }
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${ProjectProperties.agpVersion}")
        classpath(kotlin("gradle-plugin", version = Versions.kotlinVersion))
    }
}

allprojects {
    repositories {
        google()
        jcenter()
        mavenLocal()
        maven {
            setUrl("https://maven.aliyun.com/repository/public/")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/google/")
        }
        maven {
            setUrl("https://maven.aliyun.com/repository/jcenter/")
        }
        maven {
            setUrl("https://maven.aliyun.com/nexus/content/groups/public/")
        }
        maven {
            setUrl("https://jitpack.io")
        }
        maven {
            setUrl("https://jcenter.bintray.com/")
        }
    }
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
}