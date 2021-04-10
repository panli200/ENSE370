<div align="center">

## ENSE 370 - Software Systems Design - Laboratory

# Lab 6: Redesign and Refactoring

### Li Pan

</div>

---

Ensure your project diredtory matches this:

```
eg
├── readme.md
├── junit-platform-console-standalone-1.7.0-all.jar
├── bin/
├── src/
│   └── MakerDemo.java
|   └── AbstractMaker.java
|   └── CoffeeMaker.java
|   └── AbstractDecorator.java
|   └── CreamDecorator.java
|   └── SugarDecorator.java
|   └── Input.java
|   └── Output.java
|   └── Price.java
|   
└── test/
    └── MakerDemoTest.java
```

Open a terminal in the base directory

Compile your code using...

```
javac -d bin ./src/Input.java
javac -d bin -cp bin ./src/JavaMaker.java

```

And run your code using...

```
java -cp 'bin' JavaMaker
```

And compile tests on Windows...
```
javac -d bin -cp 'bin;junit-platform-console-standalone-1.7.0-all.jar' ./test/JavaMakerTest.java
```

Or compile tests on Mac or Linux...
```
javac -d bin -cp 'bin:junit-platform-console-standalone-1.7.0-all.jar' ./test/JavaMakerTest.java
```

And run our tests using...

```
java -jar junit-platform-console-standalone-1.7.0-all.jar -cp bin --scan-class-path
```


---


1. Change Signature~
```
- String[] output = new String[7];
+ final int stringSize = 7;
+ String[] output = new String[stringSize];

int offset = stringSize - i;

```

2. Duplicate funtion: Delete this funtion 
```
public String getMeaning(String string, HashMap <String, String> map) {
        if (map.containsKey(string)) {
            return map.get(string);
        } else {
            return "Illegal";
        }
    } 
```

3. Lift up the variable 
```
final int numSymbolsSmall  =  9;
final int numSymbolsMedium = 14;
final int numSymbolsLarge  = 20;
```

4. Rename the parameter  ~~ output[6]~~ 
```
printCup[6]
```

5. Delete Dead Code
```
// (size.equals("Large")){
```

6. Rename Parameter  
```
- int ingredient_pointer = 0;
+ int ingredientNum = 0;
```


7. Change Funtion Declaration 
```
- public static Input get()

+ public static Input getInput ()
```

8. Delete unnecessary code
```
finally {
    System.out.println("Not a legal number, try again!");
}

```

9. Extract function
```
for (int i = 0; i < this.ingredients.length(); i++){
            if (this.ingredients.charAt(i) == '$'){
                price += 0.1;
            } else if (this.ingredients.charAt(i) == '@') {
                price += 0.15;
            }
        }
```

```
public float getPrice() {
        return (float) (super.abstractMaker.getPrice() + 0.10);
}
public float getPrice() {
        return (float) (super.abstractMaker.getPrice() + 0.15);
}
```

10. Extract function 
```
- output [i + 1] = JavaMaker.replaceChar(output[i+1],  offset + 2 * j, this.ingredients.substring(ingredient_pointer, ingredient_pointer+1));
+ int replaceIndex = offset +2 *j; 
+ printCup[i + 1] = replaceChar(printCup[i + 1], replaceIndex, drink.substring(0, 1));

```