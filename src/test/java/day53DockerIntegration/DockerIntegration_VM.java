package day53DockerIntegration;

public class DockerIntegration_VM {
	
	//docker login password  - automation.gaddam@gmail.com, username:shagad3, password:Fantastic@4
	//1:VM
	//Host os>> will have multiple machines(winow,mac etc) 
	//creating VM is expensive.
	//2:Docker: Containerazation
	//it is a repo maintians number of images (software).
	//From image once it is downloaded, we an create a Wind or limux or mac container and work on it.
	
	//commands
	//1:Images commands >> docker images (to check the images in docker), docker pull iamgename (will download the image),docker rmi <imageid>(will remove the image
	//2:Container commands>> docker ps(check how amny containers),docker run iamgename ( ignite the image), docker start, docker stop, docker rm <container>.

	//commands  - https://www.youtube.com/watch?v=T7PjgtSpX-o&list=PLUDwpEzHYYLtQzEEEldbjPAR-gnStv4sR&index=3
	//got to 57:19 time stamp you will find all the commands or chatgpt
	
	//docker run -d -p 4442-4444:4442-4444 --net grid --name selenium-hub selenium/hub
	//docker run -d --net grid -e SE_EVENT_BUS_HOST=selenium-hub -e SE_EVENT_BUS_PUBLISH_PORT=4442 -e SE_EVENT_BUS_SUBSCRIBE_PORT=4443 selenium/node-chrome
	//docker run -d --net grid -e SE_EVENT_BUS_HOST=selenium-hub -e SE_EVENT_BUS_PUBLISH_PORT=4442 -e SE_EVENT_BUS_SUBSCRIBE_PORT=4443 selenium/node-firefox
}
