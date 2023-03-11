FROM almalinux

RUN  yum update -y &&  yum install java-11-openjdk -y &&  yum install git -y &&  yum install maven -y

RUN git clone https://github.com/up1/maven_java_web_example.git

WORKDIR $PWD/maven_java_web_example

RUN mvn clean

RUN mvn test -X

RUN mvn package

CMD ["mvn" , "tomcat7:run"]