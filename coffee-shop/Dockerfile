FROM registry.access.redhat.com/ubi8/openjdk-11:1.3

#RUN yum -y install curl
#RUN apk add curl

#COPY target/lib/* /deployments/lib/
COPY target/*-runner.jar /deployments/app.jar

CMD ["java", "-jar", "-Dquarkus.http.host=0.0.0.0", "-Djava.util.logging.manager=org.jboss.logmanager.LogManager", "/deployments/app.jar"]
