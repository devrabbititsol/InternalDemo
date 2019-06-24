source ~/.bash_rc
cd /home/devrabbit/SmartQE/SmartQE-Users/7/Selenium/InternalDemo
curl -d @configDockerFile251.xml -H 'Content-Type: text/xml' 'http://admin:admin@192.168.1.141:8081/createItem?name=InternalDemo_Docker' --user admin:11b2bb6ad5a0829d41a3149cea7bf2b07f
curl -X POST http://admin:admin@192.168.1.141:8081/job/InternalDemo_Docker/config.xml --user admin:11b2bb6ad5a0829d41a3149cea7bf2b07f --data-binary @configDockerFile251.xml
curl -X POST http://admin:admin@192.168.1.141:8081/job/InternalDemo_Docker/build --user admin:11b2bb6ad5a0829d41a3149cea7bf2b07f
