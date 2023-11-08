package mission.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import mission.wisestorage.WiseRepository;

import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;

public class LoadService {
    private final WiseRepository wiseRepository;

    public LoadService() {
        wiseRepository = new WiseRepository();
    }

    public void load() {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            File file = new File("data.json");
            List<LinkedHashMap<Integer, Object>> wises = objectMapper.readValue(file, List.class);

            wises.forEach(loadData -> {

                Long loadId = Long.parseLong(loadData.get("id").toString());
                String loadSaying = loadData.get("saying").toString();
                String loadAuthor = loadData.get("author").toString();

                wiseRepository.load(loadId, loadSaying, loadAuthor);
            });

        } catch (IOException e) {
            System.out.println("저장된 파일이 없습니다.");
        }
    }
}