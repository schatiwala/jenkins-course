job('NodeJS example') {
    scm {
        git('git://github.com/schatiwala/docker-demo.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('schatiwala')
            node / gitConfigEmail('safdar_chatiwala@yahoo.com')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('nodejs') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
