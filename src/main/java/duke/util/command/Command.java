package duke.util.command;

import duke.DukeException;
import duke.task.TaskList;
import duke.util.StoredTasks;

public abstract class Command {
    public static final String HORIZONTAL_LINE = "____________________________________________________________";
    public String command;

    public Command(String command) {
        this.command = command;
    }

    public abstract String handleCommand(TaskList taskList, StoredTasks storedTasks) throws DukeException;
}
