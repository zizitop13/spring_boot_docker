FROM zeldigas/java-layered-builder as build
COPY target/demo.jar app.jar
RUN prepare_for_docker app.jar