package Logic_Building.Logics;

import java.util.Objects;

public class StringPallindrome {
    String str;

    public StringPallindrome(String str){
        this.str = str;
    }

    public String reverse(){
        String rev = "";
        String s = this.str;
        for(int i = s.length()-1 ; i >= 0 ; i--){
            rev = rev + s.charAt(i);
        }

        return rev;
    }

    public boolean isPallindrome(){
        return Objects.equals(str, this.reverse());
    }
}
