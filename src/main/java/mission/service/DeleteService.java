package mission.service;


import mission.wisestorage.Wise;
import mission.wisestorage.WiseRepository;

public class DeleteService {

    WiseRepository wiseRepository = new WiseRepository();

    public void deleteWise(Long wiseId) {
        Wise wise = wiseRepository.deleteById(wiseId);
        if (wise == null) {
            System.out.println(wiseId + "번 명언은 존재하지 않습니다.");
        } else {
            System.out.println(wiseId + "번 명언이 삭제되었습니다.");
        }
    }

}
