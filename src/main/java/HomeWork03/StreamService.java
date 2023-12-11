package HomeWork03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StreamService {
    public void sort(List<Stream> streamList){
        StreamComparator sortStream = new StreamComparator();
        streamList.sort(sortStream);
    }
}
