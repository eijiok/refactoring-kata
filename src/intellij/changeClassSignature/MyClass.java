package intellij.changeClassSignature;

/**
 Change class signature to:

 MyClass<Param1, Param2>

 the calling: myMethod(MyClass<String, Integer> myClass)

 To change a class signature, follow these steps

 In the editor, place the cursor within the name of the class whose signature you want to change.
 Do one of the following:
 Press Ctrl+F6.
 Choose Refactor | Change Signature in the main menu.
 Select Refactor | Change Signature from the context menu.
 In the Change Class Signature dialog, use the available controls to manage the formal type parameters:
 To add a new parameter, click /help/img/idea/2016.3/new.png or press Alt+Insert. Specify the parameter name and default type in the Name and the Default Value fields respectively.
 To remove a parameter, select the parameter and click /help/img/idea/2016.3/delete.png (Alt+Delete).
 To move a parameter up or down in the list, select the parameter and then use /help/img/idea/2016.3/arrowUp.png (Alt+Up) or /help/img/idea/2016.3/arrowDown.png (Alt+Down).
 To perform the refactoring right away, click Refactor.
 */
public class MyClass {

}
