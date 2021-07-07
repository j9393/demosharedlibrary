def call(String saywhat = "nothing") {
    
      {
        sh ''' 
            echo ${WORKSPACE}
        '''
    }
    
    /*
    
    if (saywhat == "hi") {
        script {
            sh """
                echo Hi Alice
            """
        }
    } else if (saywhat == "hello") {
        script {
            sh """
                echo Hello Alice
            """
        }
    } else {
        script {
            sh """
                echo Whats up Alice
            """
        }
    }
    */
    
}

