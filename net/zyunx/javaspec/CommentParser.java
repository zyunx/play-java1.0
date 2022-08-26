package net.zyunx.javaspec;

import net.zyunx.common.Assert;
import java.util.Vector;

public class CommentParser {

  public static boolean is(SecondStepSource source) {
    int pos = source.getPos();
    Object first = source.getCharacterAt(pos);
    if (first instanceof LineTerminator) {
      return false;
    }
    char firstCh = ((InputCharacter) first).getChar();
    if (firstCh != '/') {
      return false;
    }

    Object second = source.getCharacterAt(pos+1);
    if (second instanceof LineTerminator) {
      return false;
    }
    char secondCh = ((InputCharacter) second).getChar();
    if (secondCh != '/' && secondCh != '*') {
      return false;
    }
    return true;
  }

  public static Comment parse(SecondStepSource source) {
    if (!is(source)) {
      throw new ParseException(source, "Not a comment");
    }
    Comment comment = null;
    InputCharacter slash1 = source.getInputCharacter();
    source.proceed();
    InputCharacter second = source.getInputCharacter();
    source.proceed();
    if ('*' == second.getChar()) {
      if (NotStarParser.is(source)) {
        NotStar notStar = NotStarParser.parse(source);
        TraditionalCommentTail tail = TraditionalCommentTailParser
          .parse(source);
        return new MultilineComment(slash1, second, notStar, tail);
      } else {
        // '*'
        source.proceed();
        DocCommentTail tail = DocCommentTailParser.parse(source);
        return new DocComment(); 
      }
    } else {
      // second.getChar() == '/'
      if (CharactersInLineParser.is(source)) {
        comment = new Comment(slash1, second, 
            CharactersInLineParser.parse(source),
            source.getLineTerminator());
        source.proceed();
        return comment;
      } else {
        comment = new Comment(slash1, second, 
            source.getLineTerminator());
        source.proceed();
        return comment;
      }
    }
  }

}
