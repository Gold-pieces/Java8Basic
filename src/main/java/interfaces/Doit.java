package interfaces;

import java.util.ArrayList;
import java.util.List;

public class Doit implements Practice{
    final private List<String> names = new ArrayList<>();

    @Override
    public List<String> findAllName() {
        names.add("name1");
        names.add("name2");
        names.add("name3");
        return names;
    }
}
