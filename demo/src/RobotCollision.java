import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class RobotCollision {
    public static void main(String[] args) {
        int[] positions = {3, 1, 4, 2};
        int[] healths = {10, 5, 11, 10};
        char[] directions = {'R', 'L', 'L', 'R'};
        int n = positions.length;
        List<int[]> robots = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            robots.add(new int[]{positions[i], healths[i], directions[i], i});
        }
        robots.sort(Comparator.comparingInt(robot -> (int) robot[0]));

       
    }
}
