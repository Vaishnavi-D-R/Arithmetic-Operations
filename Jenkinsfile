pipeline {
  agent any 
  environment {
    PATH= "C:\Program Files\apache-maven-3.6.3:$PATH"
  }
  stages {
    stage("CLONE") {
      steps {
        git credentialsId: 'git_credentials' , url: 'https://github.com/Vaishnavi-D-R/Arithmetic-Operations.git'
      }
    }
    stage("BUILD") {
      steps {
       sh "mvn clean install"
      }
    }
  }
 }    
