package duke.util.command;

import duke.task.TaskList;
import duke.util.StoredTasks;

public class CommandList extends Command {

    public CommandList(String command) {
        super(command);
    }

    @Override
    public String handleCommand(TaskList taskList, StoredTasks storedTasks) {
        StringBuilder listString = new StringBuilder();
        for (int i = 0; i < taskList.size(); i++) {
            listString.append(" ").append(String.valueOf(i + 1)).append(". ").append(taskList.get(i)).append("\n");
        }
        System.out.println(HORIZONTAL_LINE);
        System.out.println(listString);
        System.out.println(HORIZONTAL_LINE);
        return listString.toString();
    }
}
