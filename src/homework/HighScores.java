package homework;

public class HighScores {

    public class ScoreNode
    {
        public int score;
        public String name;
        public ScoreNode next;

        ScoreNode(int val, String p, ScoreNode n)
        {
            score = val;
            name = p;
            next = n;
        }

        ScoreNode(int val, String name)
        {
            // Call the other (sister) constructor.
            this(val, name, null);
        }
    }

    ScoreNode minScore;
    ScoreNode maxScore;

    public HighScores(){
        minScore = new ScoreNode(0, "");
        ScoreNode tmp = minScore;
        for(int i = 0; i < 9; i++){
            tmp.next = new ScoreNode(0, "");
            maxScore = tmp.next;
            tmp = tmp.next;
        }
    }


    public void insert(String name, int score){
        if(score < minScore.score)
            return;

        ScoreNode nodeToInsert = new ScoreNode(score, name);

        ScoreNode tmp = minScore;
        for(int i = 0; i < 10; i++){
            if(i == 9 && score > tmp.score){ // new max
                tmp.next = nodeToInsert;
                maxScore = nodeToInsert;
                minScore = minScore.next;
                return;
            }
            else if(score >= tmp.score && score <= tmp.next.score){ // in the middle
                nodeToInsert.next = tmp.next;
                tmp.next = nodeToInsert;
                minScore = minScore.next;
                return;
            }
            tmp = tmp.next;
        }
    }

    public String[] getScores(){
        String[] ary = new String[10];
        ScoreNode tmp = minScore;
        for(int i = 0; i < 10; i++){
            String newScore = tmp.name + ": " + tmp.score;
            ary[i] = newScore;
            tmp = tmp.next;
        }

        return ary;
    }


}
