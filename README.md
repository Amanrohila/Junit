# Junit and Sonar Qube

# Sonar Integration Step 
1. Add plugin into POM
<plugin>
				<groupId>org.sonarsource.scanner.maven</groupId>
				<artifactId>sonar-maven-plugin</artifactId>
				<version>3.6.0.1398</version>
			</plugin>

2. Download Sonarcube
https://binaries.sonarsource.com/Distribution/sonarqube/sonarqube-7.2.1.zip
i have used version 7.2.1

3. run Sonar cube
Go to ..\sonarqube-7.2.1\bin\windows-x86-64 and run StartSonar.bat

4. Now run your code by following command
mvn clean verify sonar:sonar
more can found here https://docs.sonarqube.org/latest/analysis/scan/sonarscanner-for-maven/

5. Now you anylyze your code at below url
http://localhost:9000/about

6. other alternate way is to anylyze code is use the eclipse plugin
Help>eclipse marketplace>enter sonar lint> installed

more info can find on images section

