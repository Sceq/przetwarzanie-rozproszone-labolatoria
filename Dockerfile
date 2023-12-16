FROM amazoncorretto:21-alpine-jdk
ADD target/przetwarzanie-rozproszone-release.jar przetwarzanie-rozproszone-release.jar
CMD java -jar przetwarzanie-rozproszone-release.jar