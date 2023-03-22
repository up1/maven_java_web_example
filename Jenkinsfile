pipeline{
  agent any
  tools{
      maven 'maven- id here'   
  }
  stages{
    stage("Checkout"){
      steps{
          git 'git url here' 
    }
    }
     stage("Build"){
       steps{
         sh 'mvn clean package' 
                }
            }
        }
    }


