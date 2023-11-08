package mission.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import mission.wisestorage.WiseRepository;

import java.io.File;
import java.io.IOException;


public class SaveService {
    WiseRepository wiseRepository = new WiseRepository();

    public SaveService() {
        wiseRepository = new WiseRepository();
    }

    public void save() {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.writeValue(new File("data.json"), wiseRepository.findAll());
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("data.json 파일의 내용이 갱신되었습니다.");
    }


}