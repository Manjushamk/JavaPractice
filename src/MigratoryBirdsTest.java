import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MigratoryBirdsTest {

    @Test
    public void test(){
        MigratoryBirds m = new MigratoryBirds();
        List<Integer> birdList = new ArrayList<>();
        birdList.add(2);
        birdList.add(5);
        birdList.add(1);
        birdList.add(3);
        birdList.add(4);
        birdList.add(4);
        birdList.add(3);
        birdList.add(5);
        birdList.add(1);
        birdList.add(1);
        birdList.add(2);
        birdList.add(1);
        birdList.add(4);
        birdList.add(3);
        birdList.add(3);
        birdList.add(4);
        birdList.add(2);
        int result = m.migratoryBirds(birdList);
        assertEquals(2,result);
    }

}