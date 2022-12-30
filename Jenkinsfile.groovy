pipeline {
  agent {
    docker { image 'hashicorp/packer:1.8' }
  }
  stages {
    stage('Build AMIS') {
      steps {
        sh """
        #!/bin/bash
        packer init ./AwsExamples
        packer build ./AwsExamples/aws-ubuntu.pkr.hcl
        """
      }
    }
  }
}
