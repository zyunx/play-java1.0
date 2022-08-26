package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class TokenParser {

  public static Token parse(SecondStepSource source) {
    if (NameParser.is(source)) {
      Name name = NameParser.parse(source);
      if (BooleanLiteral.is(name)) {
        return new BooleanLiteral(name);
      } else if (Keyword.is(name)) {
        return new Keyword(name);
      } else {
        return new Identifier(name);
      }
    } else if (FloatingPointLiteralParser.is(source)) {
      return FloatingPointLiteralParser.parse(source);
    } else if (IntegerLiteralParser.is(source)) {
      return IntegerLiteralParser.parse(source);
    } else if (CharacterLiteralParser.get().is(source)) {
      return CharacterLiteralParser.get().parse(source);
    } else if (StringLiteralParser.get().is(source)) {
      return StringLiteralParser.get().parse(source);
    } else if (SeparatorParser.get().is(source)) {
      return SeparatorParser.get().parse(source);
    } else if (OperatorParser.get().is(source)) {
      return OperatorParser.get().parse(source);
    }
    Assert.impossible("Token expected.");
    return null;
//    Token token = new UnknownInputElement(source.getInputCharacter());
//    source.proceed();
//    return token;
  }

}
