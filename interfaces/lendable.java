package lms.interfaces;

import lms.model.User;

public interface lendable {
    boolean lend(User user);
    void returnBook(User user);
    boolean isAvailable();
}
