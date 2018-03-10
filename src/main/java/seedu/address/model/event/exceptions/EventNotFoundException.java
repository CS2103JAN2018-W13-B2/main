package seedu.address.model.event.exceptions;

/**
 * Signals that the operation is unable to find the specified person.
 */
public class EventNotFoundException extends Exception {
    public EventNotFoundException() {
        super("Operation requires event that do not exist");
    }
}