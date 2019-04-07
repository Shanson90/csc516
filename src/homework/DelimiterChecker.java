package homework;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Stack;

public class DelimiterChecker {

    private File file;
    FileReader reader;
    private Stack<Character> delims;
    private char[] chars = new char[10000];
    private StringBuilder strBuilder = new StringBuilder();

    public DelimiterChecker(File f) throws FileNotFoundException {
        reader = new FileReader(f.getAbsolutePath());
        file = f;
        delims = new Stack<Character>();
    }

    public String validPortion() throws Exception {
        reader.read(chars, 0, 10000);
        for(char c : chars){
            strBuilder.append(c);
            if(isOpenDelim(c)){
                delims.push(c);
            }

            if(isCloseDelim(c)){
                if(closesLastOpen(c)){
                    delims.pop();
                }else{
                    strBuilder.append("\n|--- Error encountered. Delimiters do not balance. ---|\n");
                    return strBuilder.toString();
                }
            }
        }
        return strBuilder.toString();
    }

    private boolean isOpenDelim(Character c){
        return (c == '(' || c == '[' || c == '{');
    }

    private boolean isCloseDelim(Character c){
        return (c == ')' || c == ']' || c == '}');
    }

    private boolean closesLastOpen(char c) {
        return delims.peek() == getOpen(c);
    }

    private char getOpen(char c){
        if(c == ')'){
            return '(';
        }else if(c == ']'){
            return '[';
        }else{
            return '{';
        }
    }

}
