pipeline {
  agent packer
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
