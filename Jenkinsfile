pipeline{
  agent any
  tools{
    maven "MAVEN"
  }
  
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
          echo 'deploying the project '
       }
    }
  }
}
