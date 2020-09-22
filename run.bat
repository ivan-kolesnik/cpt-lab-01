echo off
set path=C:\Program Files\Java\jdk-15\bin
set include=C:\Program Files\Java\jdk-15\include
set lib=C:\Program Files\Java\jdk-15\lib
set link=C:\Program Files\Java\jdk-15\bin

javac -version com\lab_01\Main.java
java com.lab_01.Main

javap -c com.lab_01.Main > out.txt

javadoc com\lab_01\Main.java -d docs

pause