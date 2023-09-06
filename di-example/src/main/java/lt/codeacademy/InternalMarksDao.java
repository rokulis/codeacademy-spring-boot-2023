package lt.codeacademy;

import java.util.Arrays;
import java.util.List;

public class InternalMarksDao implements MarksDao {

    @Override
    public List<Integer> getMarks() {
        return Arrays.asList(5, 8, 10, 10, 7, 6, 8);
    }
}
