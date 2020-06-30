def gitUrl = 'git://github.com/himanshushar90/HelloWorld'

job('test-job') {
    scm {
        git(gitUrl)
    }
    triggers {
        scm('*/1 * * * *')
    }
    
}
