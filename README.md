# What's it
  It's a proxy based on Socks5 protocol and implemented in java. As we all known, a proxy contains 2 parts: local and server. local take over requests and relay it to server, server send these requests to remote and relay data received from remote back to local. In this proxy, these two parts are implemented into one runnable jar, and data transmits between local and server are disguised for some purpose(THE GREAT WALL). This project depends on [CloudLadder](https://github.com/SummerOak/CloudLadder), all protocol related business are handled in that project. This project is just an UI implement.
  
# How to use it

  1. Download [release](https://github.com/SummerOak/NetSword/tree/master/release) folder and config setting.txt properly;
  2. Run command "java -jar NetSword.jar s" to start the server, If you are running it on Ubuntu and you want it run permanently(such as restart automatically after a crash), you can add netsword.service to you system and use systemctl system command to start it;
  3. Before start the local part, You need make sure socks5 has open. This step can be skipped if you are running it on MAC because netsword.sh do it for you; 
  4. Finally, run command "java -jar NetSword.jar c" to start the local;
  5. If you start up NetSword sucessfully, open a website you can see net requests like this:
  ![](https://github.com/SummerOak/NetSword/blob/master/local.png?raw=true)
