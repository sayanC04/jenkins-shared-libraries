def call(String Imagename, String Imagetag, String Dockerhub-user ){
  sh "docker build -t ${Dockerhub-user}/${Imagename}:${Imagetag} ."
}
