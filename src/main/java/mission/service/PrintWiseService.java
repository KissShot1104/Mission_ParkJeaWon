package mission.service;


import mission.wisestorage.Wise;
import mission.wisestorage.WiseRepository;

import java.util.ArrayList;

public class PrintWiseService {
    private final WiseRepository wiseRepository = new WiseRepository();

    public void printWises() {

        ArrayList<Wise> wises = wiseRepository.findAll();

        System.out.println("번호 / 작가 / 명언");
        System.out.println("----------------------");
        for (Wise wise : wises) {
            System.out.println(wise.getId() + " / " + wise.getAuthor() + " / " + wise.getSaying());
        }
    }
}
