all: javaspec


ClassFileFormatViewer:
	javac net\zyunx\jvm\*.java
	java net.zyunx.jvm.ClassFileFormatViewer net\zyunx\jvm\AttributeInfoOfCode.class

javaspec:
	javac net\zyunx\common\*.java
	javac net\zyunx\javaspec\*.java
	java net.zyunx.javaspec.Main net\zyunx\javaspec\Main.java


