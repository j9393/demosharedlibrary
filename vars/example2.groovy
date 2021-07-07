def call(String saywhat = "nothing") {
    
        "C:\\Program Files\\\Git\\\bin\\sh.exe" ''' 
           echo ${saywhat}
        '''
    
   // sh label: '', script: "echo $saywhat"
    
    echo "${saywhat}"
    
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
    

