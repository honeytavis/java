mkdir /usr/local/java
tar -xvzf jdk-8u112-linux-x64.tar.gz
cp -r jdk1.8.0_112 /usr/local/java
rm -rf jdk1.8.0_112
echo -e "export JAVA_HOME=/usr/local/java/jdk1.8.0_112 \nexport CLASSPATH=.:\$JAVA_HOME/lib/dt.jar:\$JAVA_HOME/lib/tools.jar \nexport PATH=\$PATH:\$JAVA_HOME/bin" >> /etc/profile
shutdown -r now 
