// start of pipeline
pipeline{
	// where pipeline job will run
	agent any //{ label 'Windows_Slave' }
	// start of stages : build, test, deploy ...
	stages{
		// start of stage : build
		stage('build'){
			// start of running steps inside one stage
			steps{
				// invoke command to build with maven
				slackSend channel: '#build', message: 'Starting Building Pipeline!'
				bat 'mvn clean install'
				slackSend channel: '#build', message: 'Finished Building Pipeline!'
			}
		}
		
		stage('SonarQube') {
		
			environment {
		        scannerHome = tool 'SonarQubeScanner'
		    }
		    steps {
		        withSonarQubeEnv('SonarQube') { 
		           bat "${scannerHome}/bin/sonar-scanner.bat"
		      	}
		      	slackSend channel: '#build', message: 'SonarQube Analysis finished'
		    }
		 }
		 		
		// start of deploy state
		//stage('deploy') {
			// define step to run
		//	steps {
				//invoke command to stop tomcat service
		//		bat 'sc stop Tomcat8'
		//		bat 'ping localhost -n 6'
				// copy war file from build target to webapp Tomcat folder
		//		bat 'xcopy /y C:\\Program Files (x86)\\Jenkins\\workspace\\MyPipeline\\target\\Jenkins.war "C:\\Program Files\\Apache Software Foundation\\Tomcat 8.5\\webapps"'
				
				//invoke command to start tomcat service
		//		bat 'sc start Tomcat8'
		//	}
		//}
	}
	
}
