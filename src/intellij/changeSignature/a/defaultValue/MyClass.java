package intellij.changeSignature.a.defaultValue;

/**
 Changing a method signature
 add parameter double price
 using default value 0.0

 1. In the editor, place the cursor within the name of the method whose signature you want to change.
 2. Do one of the following:
 Press Ctrl+F6.
 Choose Refactor | Change Signature in the main menu.
 Select Refactor | Change Signature from the context menu.
 Note that if you refactor a method that overrides another method, IntelliJ IDEA suggests either to modify the method from the base class, or to modify only the selected method.
 In the Change Signature dialog, make the necessary changes to the method signature and specify which other, related changes are required.

 // When performing the refactoring, 0.0 was specified as
 // the default parameter value.

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

// We'll ask IntelliJ IDEA to update all the method calls.
// We'll also specify a default value to be passed to the method.