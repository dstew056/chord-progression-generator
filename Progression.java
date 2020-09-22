import java.util.Random;

public class Progression implements Comparable<Progression> {

    private int[] progression;
    private int[] weights = {20,15,17,18,19,16,13};
    public int rank;

    public Progression(int length){
        rank=0;
        progression = generate(length);

    }

    private int[] generate(int length){
        progression = new int[length];
        for(int i = 0;i<length;i++){
            progression[i] = getChord();
        }
        return progression;
    }

    private int getChord(){
        Random rand = new Random();
        return 1 + rand.nextInt(7);
    }

    public void calculateRank(){
        for (int chord:progression){
            rank+=weights[chord-1];
        }
        if(countDistinct(progression)<progression.length-1){
            rank=rank/2;
        }
    }

    private int countDistinct(int[] arr){
        int[] saved = new int[arr.length];
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++) {
                if (saved[j] == 0) {
                    sum++;
                    saved[j] = arr[i];
                    break;
                } else if (saved[j] == arr[i]) {
                    break;
                }
            }
        }
        return sum;
    }

    public void print(){
        String[] chords = {"C","Dm","Em","Fmaj7","G","Am","Bo"};
        String[] minorChords = {"Am","Bo","C","Dm","Em","Fmaj7","G"};

        for(int chord:progression){
            System.out.print(minorChords[chord-1]+" ");
        }
        System.out.print("      rank: "+rank);
        System.out.print("\n");
    }

    public int compareTo(Progression other){
        return other.rank - rank;
    }

}
