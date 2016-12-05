package intellij.changeSignature.c.newOverloadingMethod;

/**
     Add double price variable with default value 0.0 using delegate via overloading method

 // We'll ask IntelliJ IDEA to keep the method calls unchanged but
 // create a new overloading method which will call the method
 // with the new signature.
 // In IntelliJ IDEA, this way of handling the method calls is
 // referred to as Delegate via overloading method.
 */
public class MyClass {

// This is the method whose signature will be changed:

    public void myMethod(int value) {
        // some code here
    }
}
