package lc.strings;

public class CrawlerLogFolder {
    // O(n) O(1)
    public int minOperations(String[] logs) {
        int depth = 0;
        for(String log : logs) {
            if (log.equals("./")) continue;
            else if (log.equals("../")){
                depth--;
                if (depth<0) depth=0;
            } else depth++;
        }
        return depth;
    }

    public static void main(String[] args) {
        String[] logs = {"d1/","d2/","../","d21/","./"};
        CrawlerLogFolder clf = new CrawlerLogFolder();
        System.out.println(clf.minOperations(logs));
    }
}

