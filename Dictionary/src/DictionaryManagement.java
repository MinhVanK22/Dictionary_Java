import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class DictionaryManagement {
    Dictionary myDictionary = new Dictionary();

    public void insertFromCommandine() {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         for (int i = 0; i < n; i++) {
             Word newWord = new Word();
             newWord.setTarget(sc.next());
             newWord.setExplain(sc.next());
             Dictionary.listWord.add(newWord);
         }
    }

    /*public void insertFromFile() throws IOException {
        Scanner scan = new Scanner(new File("D:/Code Java/Dictionary/dictionaries.txt"));
        while (scan.hasNextLine()) {
            String stringWord = scan.nextLine();
            Scanner s = new Scanner(stringWord).useDelimiter("\n");
            Word _word = new Word();
            _word.setTarget(s.next());
            _word.setExplain(s.next());
            myDictionary.listWord.add(_word);
        }
    }*/

    public Word dictionaryLookup(ArrayList<Word> list, String target) {
        int left = 0;
        int right = list.size() - 1;
        if (right < 0) {
            System.out.println("Khong co du lieu");
            return null;
        }
        int mid = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (list.get(mid).getTarget().compareTo(target) == 0) {
                System.out.println("Tu dang kiem o vi tri: " + (mid + 1));
                return list.get(mid);
            } else if (list.get(mid).getTarget().compareTo(target) > 0) {
                right = mid - 1;
            } else if (list.get(mid).getTarget().compareTo(target) < 0) {
                left = mid + 1;
            }
        }
        System.out.println("Khong co tu trong tu dien");
        return null;
    }
}
