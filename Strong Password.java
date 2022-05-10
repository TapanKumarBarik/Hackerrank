//https://www.hackerrank.com/challenges/strong-password/problem




 /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */
static final String SPECIAL_CHARACTERS = "!@#$%^&*()-+";
    public static int minimumNumber(int n, String password) {
    // Return the minimum number of characters to make the password strong

        int addNum = 0;
        if (!password.chars().anyMatch(Character::isDigit)) {
            addNum++;
        }
        if (!password.chars().anyMatch(Character::isLowerCase)) {
            addNum++;
        }
        if (!password.chars().anyMatch(Character::isUpperCase)) {
            addNum++;
        }
        if (!password.chars().anyMatch(ch -> SPECIAL_CHARACTERS.indexOf((char) ch) >= 0)) {
            addNum++;
        }
        addNum = Math.max(addNum, 6 - password.length());

        return addNum;
    }
