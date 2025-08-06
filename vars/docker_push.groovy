def call(String imagename, String imagetag, String dockerhubuser){
  withCredentials([usernamePassword('credentialsId':"dockerHubCred",
                 passwordVariable:"dockerHubPass",
                 usernameVariable:"dockerHubUser")]){
                 sh "docker login -u ${dockerHubUser} -p ${dockerHubPass}"
                 sh "docker push ${dockerhubuser}/${imagename}:${imagetag}"
            }
}
