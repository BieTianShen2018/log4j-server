FROM apsl/tomcat6:latest
WORKDIR /usr
COPY log4j .
RUN  chmod +x log4j-server-start.sh
EXPOSE 4560














