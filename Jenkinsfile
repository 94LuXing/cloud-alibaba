//gitlab的凭证
def git_auth = "68f2087f-a034-4d39-a9ff-1f776dd3dfa8"
//构建版本的名称
def tag = "latest"
//Harbor私服地址
def harbor_url = "192.168.159.128:85/ten/"
node {
    stage('拉取代码') {
        checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: 'a70a8425-9c2f-4662-a9e9-9b43c99ca87c', url: 'https://github.com/94LuXing/cloud-alibaba.git']]])
        }
    stage('代码审查') {
        def scannerHome = tool 'sonarqube-scanner'
        withSonarQubeEnv('sonar7.6') {
            sh """
            ${scannerHome}/bin/sonar-scanner
            """
        }
    }
    stage('编译，构建镜像') {
            //定义镜像名称
            def imageName = "${project_name}:${tag}"
            //编译，构建本地镜像
            sh "mvn -f ${project_name} clean package dockerfile:build"
        }

}
