pipeline{
    agent any

    environment{

    }

    stages{

        stage('çheckout'){
            steps{
                git branch: 'main', url: "www.github.com/orgname/reponame"
            }
        }
        stage('build'){
            steps{
               sh 'mvn clean install -B'
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }
        }
        stage('build and deploy to dockerhub'){
            steps{
                script{
                    def imageName = "jaijp/sms"
                    def dockerUsername = jaijp
                    def dockerPassword = JAI1234jai

                    sh "docker login -u ${dockerUsername} -p ${dockerPassword}"
                    sh "docker build -t ${imageName}:latest ."
                    sh "docker push ${iamgeName}:latest"
                    sh "docker logout"
                }
            }
        }
    }
}
