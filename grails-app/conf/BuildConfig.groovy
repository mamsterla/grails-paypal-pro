grails.project.work.dir = 'target'

grails.project.dependency.resolver = "maven"
grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'
    checksums true
    legacyResolve false

    repositories {
        inherits true

        mavenLocal()
        grailsCentral()
        mavenCentral()
    }

    dependencies {
        runtime 'commons-codec:commons-codec:1.5'
        runtime 'commons-httpclient:commons-httpclient:3.1'
    }

    plugins {
        build ':release:3.1.1', ':rest-client-builder:2.1.1', {
            export = false
        }
    }
}
