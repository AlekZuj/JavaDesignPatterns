package net.ukr.zuj_as.command;

import java.util.Arrays;

public interface Command {

    void execute();
    void undo();
}
