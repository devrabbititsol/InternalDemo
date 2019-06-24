source ~/.bash_rc
cd /home/devrabbit/SmartQE/SmartQE-Users/7/Selenium/InternalDemo
curl -d @config484.xml -H 'Content-Type: text/xml' 'http://admin:admin@192.168.1.141:8081/createItem?name=InternalDemo' --user admin:11b2bb6ad5a0829d41a3149cea7bf2b07f
curl -X POST http://admin:admin@192.168.1.141:8081/job/InternalDemo/config.xml --user admin:11b2bb6ad5a0829d41a3149cea7bf2b07f --data-binary @config484.xml
curl -X POST http://admin:admin@192.168.1.141:8081/job/InternalDemo/build --user admin:11b2bb6ad5a0829d41a3149cea7bf2b07f
