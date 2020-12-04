package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {
    public int getUserScore(String[] records, String email) {

        for (String record : records) {
            if (record.substring(0,record.indexOf(":")).equals(email)) {
                return Integer.parseInt(record.substring(record.indexOf(":") + 1));
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
