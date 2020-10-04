gems is simple webapplication Which will show the screen with the color given in the env 


To make the docker build

```
mvn clean install 
docker build -t <docker-reg>/gems:<version> .
docker build -t narenp/gems:latest .

```

To run this image 
docker run  -p 2000:8080 --name gems -e ENV_BG_COLOR="GREEN"  narenp/gems:latest

