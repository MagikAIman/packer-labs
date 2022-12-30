pipeline {
  docker { image 'hashicorp/packer:1.8' }

  stages {
    stage('Packer - Build Ubuntu Image on vSphere') {
      steps {
        sh """
        #!/bin/bash
        packer init ./DockerExamples
        packer build ./DockerExamples
        """
      }
    }
  }
}
