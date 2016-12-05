package intellij.changeSignature.b.lookForVariable;

/**
 Changing a method signature
 add parameter double price
 using Any Var

 // We'll ask IntelliJ IDEA to update all the method calls.
 // We'll also ask IntelliJ IDEA to look for a variable
 // of the appropriate type near the method call and pass this
 // variable to the method.
 // In IntelliJ IDEA, this option is called Use Any Var.

 how keys:
 Ctrl+F6 above method
 Alt+Insert to add parameter

 */
public class MyClass {

// This is the method whose signature will be changed:

    public void myMethod(int value) {
        // some code here
    }
}

