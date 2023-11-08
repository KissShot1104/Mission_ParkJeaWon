package mission.service;


import mission.wisestorage.Wise;
import mission.wisestorage.WiseRepository;

public class ModifyService {
    private final WiseRepository wiseRepository = new WiseRepository();

    public void modifyWise(Long id) {

        Wise wise = wiseRepository.findById(id);

        if (wise == null) {
            System.out.println(id + "번 명언은 존재하지 않아 업데이트를 할 수 없습니다.");
            return;
        }

        System.out.println("명언(기존) : " + wise.getSaying());
        System.out.print("명언 : ");
        String saying = InputService.getScanner().nextLine();

        System.out.println("작가(기존) : " + wise.getAuthor());
        System.out.print("작가 : ");
        String author = InputService.getScanner().nextLine();

        Wise newWise = new Wise(wise.getId(), saying, author);
        wiseRepository.update(id, newWise);
    }
}
