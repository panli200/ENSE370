<div align="center">

## ENSE 370 - Software Systems Design - Laboratory

# Lab 7: Reverse Engineering

### Li Pan

</div>

---

```
eg
├── readme.md
├── src/
│   └── CharSort.java
|   └── Hash.java
|   └── Input.java
|   └── Login.java
|   └── Salt.java
|   └── User.java
|   
└── test/
    └── LoginTest.java
```

Make sure Junit jar file put inside the folder. Compile my code:

```
javac -d bin ./src/*..java

javac -d bin -cp 'bin:junit-platform-console-standalone-1.7.0-all.jar' ./test/LoginTest.java

java -jar junit-platform-console-standalone-1.7.0-all.jar -cp bin --scan-class-path

```