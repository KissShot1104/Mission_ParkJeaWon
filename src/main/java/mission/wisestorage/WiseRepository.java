package mission.wisestorage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WiseRepository {

    private static final Map<Long, Wise> store = new HashMap<>();

    private static Long id = 0L;

    public Long save(String saying, String author) {
        Wise wise = new Wise(++id, saying, author);
        store.put(id, wise);
        return id;
    }

    public Wise findById(Long id) {
        return store.get(id);
    }

    public ArrayList<Wise> findAll() {
        return new ArrayList<>(store.values());
    }

    public Wise deleteById(Long id) {
        return store.remove(id);
    }

    public void update(Long id, Wise wise) {
        store.put(id, wise);
    }

    public void load(Long loadId, String loadSaying, String loadAuthor) {
        Wise wise = new Wise(loadId, loadSaying, loadAuthor);
        store.put(loadId, wise);
        id = loadId;

    }
}
