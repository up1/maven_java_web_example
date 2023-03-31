pipeline{
  agent any
  
  stages{
    stage("Bulid"){
      steps{
          echo 'building the project'
    }
    }
     stage("test"){
       steps{
          echo 'testing the project '
       }
    }
     stage("deploy"){
       steps{
          sh 'mvn tomcat7:run'
       }
    }
  }
}
