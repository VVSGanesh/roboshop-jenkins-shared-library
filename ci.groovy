def call(){
    pipeline{
        agent any
        stages{
            stage("complie/built"){
                print ("compling stage")
            }
            stage("unit test"){
                print("unit test stage")
            }
            stage("quality control"){
                print("Quality control stage")
            }

        }
    }
}