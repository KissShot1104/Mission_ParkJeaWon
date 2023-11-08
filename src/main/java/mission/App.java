package mission;


import mission.service.*;

public class App {

    private final AddService addService;
    private final PrintWiseService printWiseService;
    private final DeleteService deleteService;
    private final ModifyService modifyService;
    private final SaveService saveService;
    private final LoadService loadService;

    public App() {
        addService = new AddService();
        printWiseService = new PrintWiseService();
        deleteService = new DeleteService();
        modifyService = new ModifyService();
        saveService = new SaveService();
        loadService = new LoadService();
    }

    public void start() {
        loadService.load();
        System.out.println("== 명언 앱 ==");

        while (true) {
            try {
                System.out.print("명령) ");
                String input = InputService.getScanner().nextLine();
                String[] command = InputService.parseCommand(input);

                if (command[0].equals("등록")) {
                    addService.add();
                } else if (command[0].equals("목록")) {
                    printWiseService.printWises();
                } else if (command[0].equals("삭제")) {
                    deleteService.deleteWise(Long.parseLong(command[2]));
                } else if (command[0].equals("수정")) {
                    modifyService.modifyWise(Long.parseLong(command[2]));
                } else if (command[0].equals("저장")) {
                    saveService.save();
                } else if (command[0].equals("종료")) {
                    saveService.save();
                    return;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println("잘못된 명령어 입니다.");
            }
        }


    }

}
