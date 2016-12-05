package intellij.changeSignature.d.propagateParameter;

/**
 Changing a method signature
 add parameter double price
 propagate through the callign method

 // This time we'll ask IntelliJ IDEA to propagate the new
 // parameter to the method call through the calling method
 // myMethodCall().

 how keys:
 Ctrl+F6 above method
 Alt+Insert to add parameter
 Alt+G To propagate the new parameter
 */
public class MyClass {

// This is the method whose signature will be changed:

    public void myMethod(int value) {
        // some code here
    }
}
