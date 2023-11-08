package mission.service;

import mission.wisestorage.WiseRepository;

public class AddService {
    private final WiseRepository wiseRepository = new WiseRepository();

    public void add() {

        System.out.print("명언 : ");
        String saying = InputService.getScanner().nextLine();

        System.out.print("작가 : ");
        String author = InputService.getScanner().nextLine();

        Long wiseId = wiseRepository.save(saying, author);

        System.out.println(wiseId + "번 명언이 등록되었습니다.");
    }
}
