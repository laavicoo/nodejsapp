job('Aplicacion Node.js DSL') {
    description('Aplicación Node JS DSL para el curso de Jenkins')
    scm {
        git('https://github.com/laavicoo/nodejsapp.git', 'master') { node ->
            node / gitConfigName('laavicoo')
            node / gitConfigEmail('lucki_naki@outlook.com')
        }
    }
    triggers {
        scm('H/7 * * * *')
    }
    wrappers {
        nodejs('nodejs')
    }
    steps {
        shell("npm install")
    }

    }
}
