def call() {
    // withCredentials([usernamePassword(
    //         credentialsId: "jfrog",
    //         usernameVariable: "USER",
    //         passwordVariable: "PASS"
    // )]) {
    //     sh "jfrog rt config --user=$USER --password=$PASS --interactive=false"
    //     sh "jfrog rt docker-login"
    // }
    // // sh "docker image push ${hubUser}/${project}:${ImageTag}"
   
    
    sh 'jfrog.sh'
}



// def call(String aws_account_id, String region, String ecr_repoName){
    
//     sh """
//      aws ecr get-login-password --region ${region} | docker login --username AWS --password-stdin ${aws_account_id}.dkr.ecr.${region}.amazonaws.com
//      docker push ${aws_account_id}.dkr.ecr.${region}.amazonaws.com/${ecr_repoName}:latest
//     """
// }
