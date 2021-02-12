node{
  stage('CLONE'){
    git 'https://github.com/Vaishnavi-D-R/Arithmetic-Operations'
  }
  stage('COMPILE'){
    def mvnHome = tool name: 'MAVEN-3.6.3', type: 'maven'
    sh "mvn --version"
  }
  
}
