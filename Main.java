import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        Progression [] progressionList = new Progression[100];

        for(int i=0;i<100;i++){

            progressionList[i]= new Progression(4);
            progressionList[i].calculateRank();

        }

        Arrays.sort(progressionList);

        progressionList[0].print();
        progressionList[1].print();
        progressionList[2].print();
        progressionList[3].print();
    }
}
