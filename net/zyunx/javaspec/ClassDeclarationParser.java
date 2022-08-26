package net.zyunx.javaspec;

import java.util.Vector;

public class ClassDeclarationParser {
  public static final ClassDeclarationParser SINGLETON =
    new ClassDeclarationParser();

  public static ClassDeclarationParser get() {
    return SINGLETON;
  }
  public static boolean is(ThirdStepSource source) {
    return true;
  }
  public ClassDeclaration parse(ThirdStepSource source) {
    ClassModifiers modifiers = null;
    Identifier name = null;
    Super superClass = null;
    Interfaces interfaces = null;
    ClassBody body = null;

    modifiers = ClassModifiersParser.get().parse(source);
    Keyword classKw = (Keyword) source.getToken();
    if (!classKw.is("class")) {
      throw new SyntaxException(source, "class keyword expected.");
    } 
    source.proceed();

    name = (Identifier) source.getToken();
    source.proceed();
   
    if (SuperParser.get().is(source)) {
      superClass = SuperParser.get().parse(source);
    } 

    if (InterfacesParser.get().is(source)) {
      interfaces = InterfacesParser.get().parse(source);
    }

    body = ClassBodyParser.get().parse(source);
    //System.out.println("DEBUG: " + modifiers);
    return new ClassDeclaration(
        modifiers, name, superClass, interfaces, body);
  }
}
