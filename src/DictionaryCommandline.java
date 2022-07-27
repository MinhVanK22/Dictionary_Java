import java.io.IOException;
import java.util.Scanner;
public class DictionaryCommandline {
    Dictionary myDictionary = new Dictionary();
    public void showAllWords() {
        int count = 1;
        System.out.println("No\t\t" + "| English\t\t" + "| Vietnamese");
        for (Word s : Dictionary.listWord) {
            System.out.println(String.format("%-8d %-15s %s",count, s.getTarget(), s.getExplain()));
            count++;
            if (count == 1000) break;
        }
    }

    DictionaryManagement dictionaryManagement = new DictionaryManagement();

    public void dictionaryBasic() throws IOException {
        dictionaryManagement.insertFromCommandine();
        this.showAllWords();
    }

    public void dictionaryAdvanced() throws IOException {
        Scanner sc = new Scanner(System.in);
        //dictionaryManagement.insertFromFile();
        this.showAllWords();
        dictionaryManagement.dictionaryLookup(myDictionary.listWord, sc.next());
    }
}
