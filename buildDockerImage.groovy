#!usr/bin/env groovy
def call(String imageName) {
        
        // Build Docker image
        sh "docker build -t ${imageName}:${BUILD_NUMBER} ."
         
}
