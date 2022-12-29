pipeline {
  agent any

  stages {
    stage('Packer - Build Ubuntu Image on vSphere') {
      steps {
        sh """
        #!/bin/bash
        packer init .
        packer build -force .
        """
      }
    }
  }
}
