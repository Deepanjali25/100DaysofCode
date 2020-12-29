import java.util.Arrays;

public class MicsAndJuryFlipkartContestGeeksForGeeks {
    public static void main(String[] args) {
        int N = 4;
        int M = 2;
        int[] teams = {2, 1};
        System.out.println(micsAndJury(N,M,teams));
    }
    static int micsAndJury(int N,int M,int[] teams) {
        Arrays.sort(teams);
        int NumberOfPeopleInLargestGroup = teams[M - 1];
        int[] newTeams = new int[N];
        for (int i = 0; i < M; i++) {
            newTeams[i] = teams[i];
        }
        int difference = N - M;
        newTeams[M - 1] = NumberOfPeopleInLargestGroup/2;
        newTeams[M] = NumberOfPeopleInLargestGroup/2;
        Arrays.sort(newTeams);
        return newTeams[N - 1];
    }
}
