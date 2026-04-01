package Logic_Building.Logics;

public class NumberPallindrome{
    int number;

    public NumberPallindrome(int num){
        this.number = num;
    }

    public int reverse(){
        int numb = this.number;
        int newNum = 0;
        while(numb > 0) {
            int n = numb % 10;
            numb = numb / 10;
            newNum = newNum * 10 + n;
        }

        return newNum;
    }

    public boolean isPallindrome(){
        return number == this.reverse();
    }
}
