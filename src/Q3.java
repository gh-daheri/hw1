public class GameEntry  {
    private int score;

    public GameEntry(int score) {
        this.score = score;
    }

    // Getter and setter methods for score

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        GameEntry[] A = new GameEntry[5];
        A[4] = new GameEntry(500);

        GameEntry[] B = A.clone();
        A[4].score = 550;

        System.out.println("Score in B[4]: " + B[4].score);
    }
}