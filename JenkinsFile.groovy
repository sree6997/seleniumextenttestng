
node{
    env.PATH ="C:/Program Files/apache-maven-3.8.3/bin;C:\\Windows\\System32"

    stage('checkout') {
        git 'https://github.com/sree6997/seleniumextenttestng.git'
    }
    stage('test')
            {
                bat 'mvn package'
            }
    stage('archive')
            {
                archiveArtifacts artifacts: 'target/*.jar'
            }

}
