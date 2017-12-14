cd src/
sudo rm -r **/*.class
sudo rm -r *.class
javac **/*.java
javac *.java
java Main $1
cd ..
