//def call(String name = "Alice") {
  //  script {
       // sh """
    //        echo "${name}"
       // """
   // }
//}

def call(Closure body) {
    node('windows') {
        body()
    }
}
