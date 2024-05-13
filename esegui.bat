@echo off
set CLASS_PATH=./myBin
javac -Xlint -d %CLASS_PATH% -cp ./src ./src/*.java
javac -Xlint -d %CLASS_PATH% -cp ./src ./src/Librariers/*.java
javac -Xlint -d %CLASS_PATH% -cp ./src ./src/Utility/*.java
java -cp ./myBIn/Librariers/mysql-connector-java-8.0.12.jar;./myBin SchoolManager