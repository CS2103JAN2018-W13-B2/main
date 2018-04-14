package seedu.address.model.attendance;

import seedu.address.commons.util.StringUtil;

import java.util.List;
import java.util.function.Predicate;

//@@author raynoldng
/**
 * Tests that a {@code Person}'s {@code Name} matches any of the keywords given.
 */
public class AttendanceNameContainsKeywordsPredicate implements Predicate<Attendance> {
    private final List<String> keywords;

    public AttendanceNameContainsKeywordsPredicate(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean test(Attendance attendee) {
        System.out.println("attendee: " + attendee);
        System.out.println("checking attendee: " + attendee.getPerson().getName());
        return keywords.stream()
                .anyMatch(keyword -> StringUtil.containsWordIgnoreCase(attendee.getPerson().getFullName().name, keyword));
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof AttendanceNameContainsKeywordsPredicate // instanceof handles nulls
                && this.keywords.equals(((AttendanceNameContainsKeywordsPredicate) other).keywords)); // state check
    }

}
