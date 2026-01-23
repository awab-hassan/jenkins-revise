def test() {
    echo "Started the testing of application....."
    sh 'mvn test'
}

def deployApp() {
    echo "Deploying the app..."
}

return this
