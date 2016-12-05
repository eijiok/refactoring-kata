package intellij.changeSignature.d.propagateParameter;

public class MyOtherClass {
    public void myMethodCall(MyClass myClass) {
        double d=0.5;

        // Here is the method call:

        myClass.myMethod(1);
    }
}